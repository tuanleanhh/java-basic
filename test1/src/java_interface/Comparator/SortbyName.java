package java_interface.Comparator;

import OOP.DocGhiDulieu.Student;

import java.util.Comparator;

public class SortbyName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String name1 =o1.getFullName().substring(o1.getFullName().lastIndexOf(" "));
        String name2 = o2.getFullName().substring(o2.getFullName().lastIndexOf(" "));
        return name1.compareTo(name2); //tang dan
//        return name2.compareTo(name1); // giam dan

        //if name 1 greater than name2 then swap
    }
}
