package View;

import Controller.ControllerUtility;
import Controller.DataController;
import model.Book;
import model.BookReaderManagement;
import model.Reader;

import java.util.ArrayList;
import java.util.Scanner;

// viet ra cac chuc nang 1,2
public class view {
    public static void main(String[] args) {
        int choice = 0;
        var bookFileName = "BOOK1.DAT";
        var readerFileName = "READER.DAT";
        var brmFileName = "BRM.DAT";

        var controller = new DataController();
        var ultility = new ControllerUtility();

        var books = new ArrayList<Book>();
        var readers = new ArrayList<Reader>();
        var brms = new ArrayList<BookReaderManagement>();

        var isReaderCheck = false;
        var isBookCheck = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("___________________________MENU______________________________");
            System.out.println("1. Them mot dau sach vao file.");
            System.out.println("2. Hien thi danh sach co trong file.");
            System.out.println("3. Them mot ban doc vao file.");
            System.out.println("4. Hien thi ban doc co trong file.");
            System.out.println("5. Lap thong tin quan ly muon.");
            System.out.println("6. Sap xep.");
            System.out.println("7. Tim kiem thong tin quan ly muon theo ten ban doc.");
            System.out.println("0. Thoat khoi ung dung.");
            System.out.println("Ban chon ?");

            choice = scanner.nextInt();
            scanner.nextLine(); // doc bo dong chua lua chon
            switch (choice) {
                case 0:
                    System.out.println("_______________________________________________________________");
                    System.out.println("Cam on da su dung dich vu!");
                    break;
                case 1:
                    if (!isBookCheck) {
                        checkBookID(controller, bookFileName); // bookid ko bi trung va tu dong tang1
                        isBookCheck = true;
                    }

                    String[] specs = {"Science", "Art", "Economic", "IT"};
                    // public Book(int bookID, String bookName, String author,
                    // String specialization, int publishYear, int quantity)
                    System.out.println("Nhap ten sach: ");
                    String bookName, author, spec;
                    int year, quan, sp;
                    bookName = scanner.nextLine();

                    System.out.println("Nhap vao ten tac gia: ");
                    author = scanner.nextLine();

                    do {
                        System.out.println("Nhap the loai sach: ");
                        System.out.println("1. Science.\n2. Art.\n3. Economic\n4. IT");
                        sp = scanner.nextInt();
                    } while (sp < 1 || sp > 4); // khi sp <1 >4 thi vong lap se lap lai
                    spec = specs[sp - 1];
                    System.out.println("Nhap nam xuat ban: ");
                    year = scanner.nextInt();

                    System.out.println("Nhap so luong: ");
                    quan = scanner.nextInt();

                    Book book = new Book(0, bookName, author, spec, year, quan); // bookID=0 => Id tu tang
                    controller.writeBookToFile(book, bookFileName);

                    break;
                case 2:
                    books = controller.readBooksFromFile(bookFileName); //line 15
                    showBookInfo(books);
                    break;
                case 3:
                    if (!isReaderCheck) {
                        checkReaderID(controller, readerFileName);
                        isReaderCheck = true;
                    }
                    //public Reader(int readerID, String fullName, String address, String phoneNumber)
                    String name, address, phone;
                    System.out.println("Nhap ten ban doc: ");
                    name = scanner.nextLine();
                    System.out.println("Nhap dia chi: ");
                    address = scanner.nextLine();
                    do {
                        System.out.println("Nhap so dien thoai:");
                        phone = scanner.nextLine();
                    } while (phone.matches("\\d{9}"));

                    Reader reader = new Reader(0, name, address, phone);
                    controller.writeReaderToFile(reader, readerFileName);
                    break;
                case 4:
                    readers = controller.readReadersFromFile(readerFileName);
                    showReaderInfo(readers);
                    break;
                case 5: //Y so 5 trong de
                    //B0
                    readers = controller.readReadersFromFile(readerFileName);
                    books = controller.readBooksFromFile(bookFileName);
                    brms = controller.readBRMFromFile(brmFileName);
                    //B1
                    int readerID,bookID;
                    boolean isBorrowable = false;
                    do{
                        showReaderInfo(readers);
                        System.out.println("______________________________________________________");
                        System.out.println("Nhap ma ban doc, Nhap 0 de bo qua: ");
                        readerID = scanner.nextInt();
                        if(readerID==0){
                            break; // tat ca ban doc da duoc muon du sach
                        }
                        isBorrowable =  checkBorrowed(brms,readerID);
                        if(isBorrowable){
                            break;
                        }else {
                            System.out.println("Ban doc da muon qua so lan cho phep!!");
                        }
                    }while (true);
                    //B2
                    boolean isFull =false;
                    do{
                        showBookInfo(books);
                        System.out.println("______________________________________________________");
                        System.out.println("Nhap ma sach,nhap 0 de bo qua");
                        bookID = scanner.nextInt();
                        if(bookID==0){
                            break;
                        }
                        isFull = checkFull(brms,readerID,bookID); // true neu da muon >=3
                        if(isFull){
                            System.out.println("Vui long chon dau sach khac!");
                        }
                        else {
                            break;
                        }
                    }while (true);
                    //B3
                    int total = getTotal(brms,readerID,bookID);
                    do{
                        System.out.println("Nhap so luong muon, to da 3 cuon (da muon "+total+" )");
                        int x = scanner.nextInt();
                        if ((x+total)>=1 && (x+total)<=3){
                            total+=x;
                            break;
                        }else {
                            System.out.println("Nhap qua so luong quy dinh! Vui long nhap lai.");
                        }
                    }while (true);
                    scanner.nextLine();// doc bo dong co chua so

                    System.out.println("Nhap tinh trang: ");
                    String status="";
                    status = scanner.nextLine();

                    //B4
                    //public BookReaderManagement(Book book, Reader reader,
                    //                                int numOfBorrow, String state, int totalOfBorrowed)
                    Book currentBook = getBook(books,bookID);
                    Reader currentReader= getReader(readers,readerID);

                    BookReaderManagement B = new BookReaderManagement(currentBook,currentReader,
                                                                total,status,0);

                    //var ultility = new ControllerUtility();
                    brms = ultility.updateBRMInfo(brms,B); // cap nhat danh sach quan ly muon
                    controller.updateBRMFile(brms,brmFileName); // cap nhat file du lieu

                    //B5
                    showBRMInfo(brms);

                    break;
                case 6:
                    brms = controller.readBRMFromFile(brmFileName);// doc ra danh sach quan ly
                    // update tong so luong muon
                    brms = ultility.updateTotalBorrow(brms);

                    System.out.println("__________________________________________________");
                    System.out.println("____________________Cac lua chon sap xep_____________________");
                do{
                    int x = 0;
                    System.out.println("1. Sap xep ten ban doc (A-Z)");
                    System.out.println("2. Sap xep tong so luong muon giam dan.");
                    System.out.println("0. Tro lai menu chinh!");
                    System.out.println("Ban chon?");
                    x = scanner.nextInt();
                    if (x==0){
                        break;
                    }
                    switch (x){
                        case 1:
                            //sap xep theo ten
                            brms = ultility.sortByReaderName(brms);
                            showBRMInfo(brms);
                        case 2:
                            //sap xep theo so luong
                            brms = ultility.sortByNumOfBorrow(brms);
                            showBRMInfo(brms);
                            break;
                    }
                }while (true);
                break;

                case 7:
                    brms = controller.readBRMFromFile(brmFileName);
                    System.out.println("Nhap tu khoa:");
                    String key = scanner.nextLine();
                    var result = ultility.searchByReaderName(brms,key);
                    if(result.size()==0){
                        System.out.println("Khong tim thay ket qua!");
                    }else {
                        showBRMInfo(result);
                    }
                    break;
            }



        } while (choice != 0);

    }

    private static void showBRMInfo(ArrayList<BookReaderManagement> brms) {
        for (var r:brms
             ) {
            System.out.println(r);

        }
    }

    private static Book getBook(ArrayList<Book> books, int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getBookID() == bookID){
                return books.get(i);
            }
        }
        return null;
    }
    private static Reader getReader(ArrayList<Reader> readers, int readerID){
        for (int i = 0; i < readers.size(); i++) {
            if(readers.get(i).getReaderID()==readerID){
                return readers.get(i);
            }
        }
        return null;
    }

    private static int getTotal(ArrayList<BookReaderManagement> brms,
                                int readerID, int bookID) {
        for (var r:brms
             ) {
            if(r.getReader().getReaderID() == readerID && r.getBook().getBookID() == bookID){
                return r.getNumOfBorrow();
            }

        }
        return 0;

    }

    private static boolean checkFull(ArrayList<BookReaderManagement> brms, int readerID, int bookID) {
        for (var r:brms
             ) {
            if(r.getReader().getReaderID() == readerID
                    && r.getBook().getBookID() == bookID && r.getNumOfBorrow() >= 3){
                return true; // khong duoc muon tiep
            }
        }
        return false; // duoc muon tiep
    }

    private static void showReaderInfo(ArrayList<Reader> readers) {
        System.out.println("__________________________________THONG TIN BAN DOC__________________________________");
        for (var c : readers
        ) {
            System.out.println(c);
        }
    }

    private static void checkBookID(DataController controller, String fileName) {
        var listBooks = controller.readBooksFromFile(fileName);
        if (listBooks.size() == 0) {
            //do nothing
        } else {
            Book.setId(listBooks.get(listBooks.size() - 1).getBookID() + 1); // tranh ko de sach bi trung
        }
    }

    private static void checkReaderID(DataController controller, String fileName) {
        var listReaders = controller.readReadersFromFile(fileName);
        if (listReaders.size() == 0) {
            //do nothing
        } else {
            Reader.setId(listReaders.get(listReaders.size() - 1).getReaderID() + 1);
        }
    }

    private static void showBookInfo(ArrayList<Book> books) {
        System.out.println("_______________________THONG TIN SACH TRONG FILE______________________");
        for (var b : books
        ) {
            System.out.println(b);

        }
    }
    public static boolean checkBorrowed(ArrayList<BookReaderManagement> brms , int readerID){
        int count = 0;
        for (var r:brms
             ) {
            if (r.getReader().getReaderID() == readerID){
                count+= r.getNumOfBorrow();
            }

        }
        if (count >=15){
            return false; // ko con co hoi muon
        }
        return  true;
    }

}
/*
    Y so 5: Viet menu Tao thong tin Book Managerment (kho nhat)
        B1: Doc danh sach cac sach, ban doc, thong tin quan ly muon
        B2: Chon 1 ban doc tu danh asch de cho pep muon.neu da chon du so luong cho phep thi khong chon nua
        B3: Chon 1 dau sach can muon, neu dau sach do da muon toi da so cuong cho phep
        thi khong duoc lay tiep, yeu cau dau sach khac
        B3: Neu duoc phep muon tiep thi thuc hien nhap so luong muon, tinh trang sach luc muon
        B4: Cap nhat lai file BRM.DAT
        B5. In danh sach tren ra man hinh
 */