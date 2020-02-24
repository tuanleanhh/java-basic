package java_interface.Comparator;

import OOP.DocGhiDulieu.Student;

import java.util.Comparator;

public class SortbyStID implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentID().compareTo(o2.getStudentID());
    }
}
