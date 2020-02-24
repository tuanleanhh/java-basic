package Example1;

import java.util.Random;
import java.util.Scanner;
import Example1.Student;

public class Person {
    private String fullName;
    private String gender;
    private String date;
    private String address;

    public Person() {
        inputInfor();
    }

    public static void main(String[] args) {
//        String name;
//        String sex;
//        String date;
//        String adderss;
//        int n = new Random().nextInt(7)+2;
//        for (int i = 1; i < n; i++) {
//            System.out.println("Nhap thong tin nguoi thu "+i+": ");
//            System.out.println("Ten: ");
//            name = new Scanner(System.in).nextLine();
//            System.out.println("Sex: ");
//            sex = new Scanner(System.in).nextLine();
//            System.out.println("Ngay Sinh: ");
//            date = new Scanner(System.in).nextLine();
//            System.out.println("Address: ");
//            adderss = new Scanner(System.in).nextLine();
 //           inputInfor();
  //          showInfor();

       // }

    }
    public void inputInfor(){
        String name;
        String sex;
        String date;
        String adderss;
            System.out.println("Nhap thong tin: ");
            System.out.println("Ten: ");
            name = new Scanner(System.in).nextLine();
            System.out.println("Sex: ");
            sex = new Scanner(System.in).nextLine();
            System.out.println("Ngay Sinh: ");
            date = new Scanner(System.in).nextLine();
            System.out.println("Address: ");
            adderss = new Scanner(System.in).nextLine();
            //Person person = new Person(name,sex,date,adderss);
            showInfor(name,sex,date,adderss);
    }
    public void showInfor(String fullName,String gender,String date,String address ){
        System.out.println("Ten: "+fullName+";   "+"Gender: "+gender+";   "
        +"Ngay Sinh: "+date+";   "+"Dia Chi: "+address);



    }

    public Person(String fullName, String gender, String date, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.date = date;
        this.address = address;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
