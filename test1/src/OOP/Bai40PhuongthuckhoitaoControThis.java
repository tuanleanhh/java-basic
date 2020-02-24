package OOP;

import model.StudentClassB37;

/*
    - constructor continues
    - cach lam:
        + giam gia tri phuong thuc ma tham so trung ten voi thuoc tinh
        + goi phuong thuc khoi tao khac
 */
public class Bai40PhuongthuckhoitaoControThis {
    public static void main(String[] args) {
        StudentClassB37 student = new StudentClassB37("11165699", 4, 3.25f, "CNTT");
        System.out.println("ID: " + student.getStudentID());
        System.out.println("AvgM: " + student.getStudentAVGMark());
    }
}
