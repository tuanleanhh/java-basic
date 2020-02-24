package java_interface;
/*
    Su dung comparator interface
    viet lop rieng de thuc hien sap xep
 */

import OOP.DocGhiDulieu.Student;
import java_interface.Comparator.SortbyMark;
import java_interface.Comparator.SortbyName;
import java_interface.Comparator.SortbyStID;

import java.util.ArrayList;
import java.util.Collections;

public class Bai71ComparatorInterface {
    public static void main(String[] args) { //them interface Compareble vao class Student
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("Le Quan", "06546456", "11165699",
                "NEU", 2, 3.25f);
        Student student1 = new Student("Hoa An", "03265545", "11162455",
                "HUST", 5, 2.56f);
        Student student2 = new Student("Bao Tra", "0562455666", "11156665",
                "NEU", 4, 1.52f);
        Student student3 = new Student("Cao Van", "053254645", "11163548",
                "Neu", 3, 0.53f);
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println("Truoc khi sap xep:");
        for (var b : list
        ) {
            System.out.println(b);
        }

//        System.out.println("Sau khi sap xep: ");
//        Collections.sort(list,new SortbyName()); // sap xep theo tieu chi duoc dua ra o class Student(studentID)
//        for (var x :list
//        ) {
//            System.out.println(x);
//        }
//    }
//        System.out.println("Sau khi sap xep: ");
//        Collections.sort(list, new SortbyMark()); // sap xep theo tieu chi duoc dua ra o class Student(studentID)
//        for (var x : list
//        ) {
//            System.out.println(x);
//        }
        System.out.println("Sau khi sap xep: ");
        Collections.sort(list,new SortbyStID()); // sap xep theo tieu chi duoc dua ra o class Student(studentID)
        for (var x :list
        ) {
            System.out.println(x);
        }

    }

}
