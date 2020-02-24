package java_interface.Comparator;

import OOP.DocGhiDulieu.Student;

import java.util.Comparator;

public class SortbyMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        float res = o1.getAvgMark()-o2.getAvgMark();
        if (res>0){
            return -1; // do nothing
        } else if(res<0){
            return 1;// swap o1,o2 // giam dan
        }
        return 0;
    }
}
