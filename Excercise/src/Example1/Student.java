package Example1;
import Example1.Person.*;

import java.util.Scanner;

public class Student extends Person {
    public Student(String fullName, String gender, String date, String address) {
        super(fullName, gender, date, address);
    }
    private String studentID;
    private String email;
    private float avgMark;
    public Student() {

    }

     public void inputInfor(){
        super.inputInfor();

    }

    public static void main(String[] args) {

    }
}
