package OOP.KeThua;

import model.People;

import java.io.Serializable;
import java.util.Objects;

public class Student extends Personal implements Serializable {
    private String studentID;
    private String univerName;
    private String avgMark;

    public Student(String studentID, String univerName, String avgMark) {
        this.studentID = studentID;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }

    public Student(String fullName, String ID, String studentID, String univerName, String avgMark) {
        super(fullName, ID);
        this.studentID = studentID;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }

    public Student(String fullName, String ID) {
        super(fullName, ID);
    }

    public Student() {

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public String getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(String avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public void showInfo() { //override phuong thuc showInfor o lop personal
        //super.showInfo();
        System.out.println("Full Name"+super.getFullName());
        System.out.println("ID: "+super.getID());
        System.out.println("Student ID: " + studentID
                + "\nUniversityName: " + univerName + "\nAverage Mark: " + avgMark);
    }

    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject)){
            return false;
        }
        Student student = (Student) otherObject;
        return avgMark == student.avgMark
                && Objects.equals(studentID,student.studentID)
                && Objects.equals(univerName,student.univerName);
    }

    @Override
    public String toString() {
        return super.toString()+"["+"StudentID: "+ studentID + "univerName: "+univerName+" avgMark: "+avgMark+"]";
    }
}
