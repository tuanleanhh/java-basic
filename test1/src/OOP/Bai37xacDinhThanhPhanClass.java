package OOP;

import model.StudentClassB37;

import java.util.Scanner;

//xac dinh class trong OOP
public class Bai37xacDinhThanhPhanClass {
    /*
            -xac dinh ten class
            - xac dinh cac thuoc tinh
            - xac dinh cac phuong thuc
     */
    public static void main(String[] args) {
        StudentClassB37 studentA = new StudentClassB37();
        studentA.setStudentID("11165699");
        String aID = studentA.getStudentID();

        System.out.println(aID);
        StudentClassB37 studentB = new StudentClassB37();
        studentB.setStudentID("11165698");
        String bID= studentB.getStudentID();
        System.out.println(bID);
//        studentA.doExam();
//        studentA.seeStudentResult();
//        studentA.goToSchool();

    }


}
