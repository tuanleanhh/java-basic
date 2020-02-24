package Controller;

import model.Book;
import model.BookReaderManagement;
import model.Reader;

import javax.security.sasl.SaslClient;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
    tu 1-5:thao tac voi file
    Ghi thong tin vao file
    Ghi thong tin ban doc vao file
    Ghi thong tin BRM vao file

    Doc thong tin tu file
                           - chuyen thanh doi tuong sach
                           - them vao danh sach cac sach
                           - tra ve danh sach cac sach
    Doc thong tin ban doc tu file
                           - chuyen thanh doi tuong ban doc(user)
                           - them vao danh sch cac sach
                           - tra ve danh sach cac sach
    Doc thong tin BRM tu file
                           - chuyen thanh doi tuong BRM
                           - them vao danh sach cac BRM
                           - tra ve danh sach cac BRM
    Quy uoc ghi hong tin:
                           - Moi doi tuong ghi tren 1 dong
                           - giua cac thuoc tinh cach nhau boi dau /
    Vi du: Lop Reader(ReaderID,fullName,address,phoneNumber) thi thong tin trong file se la readerID/fullname/address/phonenumber
 */
public class DataController {
    private FileWriter fileWriter; //được sử dụng để ghi các dữ liệu theo định dạng ký tự vào một file.
    private BufferedWriter bufferedWriter; //giup ghi du lieu hieu qua hon
    private PrintWriter printWriter;//Nó được sử dụng để ghi các định dạng
    // đại diện của các đối tượng vào stream hướng văn bản.
    private Scanner scanner;

    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true); // append:true se ghi vao cuoi file neu file co du lieu
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File Erro");
        }
    }

    public void writeBookToFile(Book book, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(book.getBookID() + "|" + book.getBookName() + "|"
                + book.getAuthor() + "|" + book.getSpecialization() + "|"
                + book.getPublishYear() + "|" + book.getQuantity());
        closeFileAfterWrite(fileName);

    }

    public void writeReaderToFile(Reader reader, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(reader.getReaderID() + "|" + reader.getFullName() + "|"
                + reader.getAddress() + "|" + reader.getPhoneNumber());
        closeFileAfterWrite(fileName);
    }

    public void writeBRMToFile(BookReaderManagement brm, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(brm.getReader().getReaderID() + "|" + brm.getBook().getBookID() + "|"
                + brm.getNumOfBorrow() + "|" + brm.getState());
        closeFileAfterWrite(fileName);

    }

    public void closeFileAfterWrite(String fileName) {
        //dong file theo thu tu nguoc lai voi thu tu ghi file
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File Erro");
        }
    }

    public void openFileToRead(String fileName) {
        try {
            File file = new File(fileName);
            if(!file.exists()){  // neu file chua ton tai
                file.createNewFile(); // tao moi file
            }
            scanner = new Scanner(Paths.get(fileName), "UTF-8"); // doc file
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi File!");

        }
    }

    public void closeFileAfterRead(String fileName) {
        try {
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi File!");
        }
    }
    public ArrayList<Reader> readReadersFromFile(String fileName){
        openFileToRead(fileName);
        ArrayList<Reader> readers = new ArrayList<>();
        //doc du lieu trong file
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            Reader reader = creatReaderFromData(data);
            readers.add(reader);

        }
        closeFileAfterRead(fileName);
        return readers;
    }

    public Reader creatReaderFromData(String data) { //chuyen doi doi tuong
        String[] datas = data.split("\\|");
        //printWriter.println(reader.getReaderID() + "|" + reader.getFullName() + "|"
              //  + reader.getAddress() + "|" + reader.getPhoneNumber());
        Reader reader = new Reader(Integer.parseInt(datas[0]),datas[1],datas[2],datas[3]);
        return reader;
    }

    public ArrayList<Book> readBooksFromFile(String fileName){
        openFileToRead(fileName);
        ArrayList<Book> books = new ArrayList<>();
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            Book book = creatBooksFromData(data);
            books.add(book);
        }
        closeFileAfterRead(fileName);
        return books;
    }

    public Book creatBooksFromData(String data) {
        String[] datas = data.split("\\|"); // xoaa dau |
        // public Book(int bookID, String bookName, String author,
        // String specialization, int publishYear, int quantity)
        Book book = new Book(Integer.parseInt(datas[0]),datas[1],datas[2],datas[3],Integer.parseInt(datas[4]),
                Integer.parseInt(datas[5]));


        return book;
    }
    public ArrayList<BookReaderManagement> readBRMFromFile(String fileName){
        var books = readBooksFromFile("BOOK1.DAT");
        var readers = readReadersFromFile("READER.DAT");

        openFileToRead(fileName); //mo file
        ArrayList<BookReaderManagement> brms = new ArrayList<>();
        while (scanner.hasNextLine()){
            String data = scanner.nextLine(); //doc
            BookReaderManagement brm = creatBRMFromData(data,readers,books); //chuyen doi
            brms.add(brm); // them vao danh sach
        }
        closeFileAfterRead(fileName);
        return brms;
    }

    public BookReaderManagement creatBRMFromData(String data,ArrayList<Reader> readers,ArrayList<Book> books) {
        String[] datas = data.split("\\|");
        //printWriter.println(brm.getReader().getReaderID() + "|" + brm.getBook().getBookID() + "|"
        //                + brm.getNumOfBorrow() + "|" + brm.getState());
        //ublic BookReaderManagement(Book book, Reader reader,
        //                                int numOfBorrow, String state, int totalOfBorrowed) {
        BookReaderManagement brm =
                new BookReaderManagement(getBook(books,Integer.parseInt(datas[1])),
                        getReader(readers,Integer.parseInt(datas[0])),
                        Integer.parseInt(datas[2]),datas[3],0);

        return brm;
    }

    /**
     * phuong thuc nay tra ve doi tuong reader trong danh sach voi id cho truoc
     * @param books
     * @param bookID
     * @return
     */
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

    public void updateBRMFile(ArrayList<BookReaderManagement> list,String fileName){
        // xoa bo file cu
        File file =  new File(fileName);
        if(file.exists()){
            file.delete(); // xoa bo file do
        }
        //ghi lai file moi
        openFileToWrite(fileName);
        for (var brm:list
             ) {
            printWriter.println(brm.getReader().getReaderID() + "|" + brm.getBook().getBookID() + "|"
                    + brm.getNumOfBorrow() + "|" + brm.getState());
        }
        closeFileAfterWrite(fileName);

    }

}
