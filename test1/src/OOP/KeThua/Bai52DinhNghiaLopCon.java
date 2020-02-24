package OOP.KeThua;
/*
    Phan Inheritance bao gom:
        -   Lop cha, lop con
        -   Lop Object
        -   wrappers va autoboxing
            Lop enum
            Lop ArrayList
            Goi y thiet ke cho inheritance
 */

public class Bai52DinhNghiaLopCon {
    //Dinh nghia lop con
    public static void main(String[] args) {
        Student student = new Student();
        Employee employee = new Employee();
        student.getFullName(); // phuong thuc public cua class Person do class Student ke thua.
        employee.getFullName();

    }
}
/*
 lop cha: super class, base class,parent class
 lop con: sub classs, derived class, child class

 */