package View;

import controller.ControllerUltility;
import controller.DataController;
import model.Student;
import model.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        int choice = 0;
        var studentFileName = "STUDENTS.DAT";
        var subjectFileName = "SUBSJECT.DAT";

        var controller = new DataController();
        var ultility = new ControllerUltility();

        var subjects = new ArrayList<Subject>();
        var students = new ArrayList<Student>();

        var isSubjectChecked = false;
        var isStudentChecked = false;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("_____________________________MENU______________________________");
            System.out.println("1. Them moi 1 mon hoc.");
            System.out.println("2. Hien thi danh sach mon hoc.");
            System.out.println("3. Them moi mot hoc sinh.");
            System.out.println("4. Hien thi danh sach hoc sinh.");
            System.out.println("0. Thoat chuong trinh.");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("_____________________________________________");
                    System.out.println("Cam on da su dung!");
                    break;
                case 1:
                    if(!isSubjectChecked){
                        checkSubjectID(controller,subjectFileName);
                        isSubjectChecked = true;
                    }
                    String [] stypes = {"General","Specialization Base"
                            ,"Compulsory Majors","Specialization Options"};
                    String subjectName,subjectType;
                    int totalLeson ,st;
                    System.out.println("Nhap ten mon hoc:");
                    subjectName = scanner.nextLine();
                    System.out.println("Nhap so tiet:");
                    totalLeson = scanner.nextInt();
                    do{
                        System.out.println("Nhap kieu mon hoc: ");
                        System.out.println("1. General. \n2. Specialization Base. \n3. Compulsory Majors. \n4. Specialization Options");
                        st = scanner.nextInt();
                    }while (st<1||st>4);
                    subjectType = stypes[st-1];

                    Subject subject = new Subject(0,subjectName,totalLeson,subjectType);
                    controller.writeSubjectToFile(subject,subjectFileName);

                    break;
                case 2:
                    subjects = controller.readSubjectFromFile(subjectFileName);
                    showSubjectsInfor(subjects);
                    break;
                case 3:
                    if(!isStudentChecked){
                        checkStudentID(controller,studentFileName);
                        isStudentChecked = true;
                    }
                    String fullName, address, phoneNumber;
                    System.out.println("Nhap ho va ten sinh vien:");
                    fullName = scanner.nextLine();
                    System.out.println("Nhap dia chi:");
                    address = scanner.nextLine();
                    do {
                        System.out.println("Nhap so dien thoai:");
                        phoneNumber = scanner.nextLine();
                    }while (phoneNumber.matches("\\d{9}"));
                    Student student = new Student(0,fullName,address,phoneNumber);
                    controller.writeStudentToFile(student,studentFileName);
                    break;
                case 4:
                    students = controller.readStudentFromFile(studentFileName);
                    showStudentInfor(students);
                    break;

            }
        }while (choice!=0);


    }
    private static void showSubjectsInfor(ArrayList<Subject>subjects){
        System.out.println("_______________________________THONG TIN MON HOC________________________________");
        for (var r:subjects
             ) {
            System.out.println(r);
        }
    }
    private static void showStudentInfor(ArrayList<Student>students){
        System.out.println("__________________________THONG TIN HOC SINH______________________________");
        for (var r:students
             ) {
            System.out.println(r);
        }
    }

    private static void checkSubjectID(DataController controller, String fileName) {
        var subjects = controller.readSubjectFromFile(fileName);
        if(subjects.size()==0){
            //do nothing
        }else {
            Subject.setId(subjects.get(subjects.size()-1).getSubjectID()+1);
        }
    }
    private static void checkStudentID(DataController controller,String fileName){
        var students = controller.readStudentFromFile(fileName);
        if(students.size()==0){

        }else {
            Student.setId(students.get(students.size()-1).getStudentID()+1);
        }
    }
}
