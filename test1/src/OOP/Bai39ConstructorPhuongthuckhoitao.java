package OOP;

/// Constructor-Phuong thuc khoi tao!
/*
    - dung de khoi tao gia tri cho doi tuong
    - cung ten voi ten class
    - mot lop co the co > 1 constructor
    - mot phuong thuc khoi tao co the co 0,1 hoac nhieu tham so
    - constructor ko tra ve
    - constructor luon goi voi toan tu new

    *Ap dung overloading de tao nhieu phuong thuc khoi tao
 */

import model.StudentClassB37;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bai39ConstructorPhuongthuckhoitao {
    public static void main(String[] args) {
        StudentClassB37 student = new StudentClassB37("11165699", 4, 4.2f,"CNTT");
        // vi du phuong thuc khoi tao(khoi tao phuong thuc)
        //Scanner scanner = new Scanner(System.in); // tham so o trong dau (), nhieu tham so cach nhau boi dau ","
        //student.setStudentID("11165699");
        System.out.println("Student ID: "+student.getStudentID());
        //student.setStudentYears(4);
        System.out.println("Student years: "+student.getStudentYears());
        System.out.println("Student Avg Mark: "+student.getStudentAVGMark());
        System.out.println("Student Falcuty: "+student.getFalcuty());

    }

}
