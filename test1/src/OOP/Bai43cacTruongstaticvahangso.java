package OOP;
/*
        -truong static
        -hang so static
        - phuong thuc static
        - cac phuong thuc factory
        -phuong thuc main

 */

import model.People;
import model.StudentClassB37;

public class Bai43cacTruongstaticvahangso {
    public static void main(String[] args) {
        // truogn static VD: public static .... la mot truong static
        //dung chung cho tat cac cac doi tuong cua 1 lop: class StudentClassB37 line 8
        People people1 = new People();
        people1.setOld();
        People people2 = new People();
        people2.setOld();
        People people3 = new People();
        people3.setOld();
        People people4 = new People();
        people4.setOld();

        System.out.println(people1.getOld());
        System.out.println(people2.getOld());
        System.out.println(people3.getOld());
        System.out.println(people4.getOld());
    }

// hang so static: doi tuong nao cung co the truy cap
    //VD
    public static final double PI = Math.PI;

}
