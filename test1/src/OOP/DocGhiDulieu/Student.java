package OOP.DocGhiDulieu;

import java.io.Serializable;

public class Student implements Serializable,Comparable<Student> {
    private String fullName;
    private String ID;
    private String studentID;
    private String univerName;
    private int studentYear;
    private float avgMark;

    public Student(String fullName, String ID, String studentID, String univerName, int studentYear, float avgMark) {
        this.fullName = fullName;
        this.ID = ID;
        this.studentID = studentID;
        this.univerName = univerName;
        this.studentYear = studentYear;
        this.avgMark = avgMark;
    }

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", ID='" + ID + '\'' +
                ", studentID='" + studentID + '\'' +
                ", univerName='" + univerName + '\'' +
                ", studentYear=" + studentYear +
                ", avgMark=" + avgMark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        String name1 = fullName.substring(fullName.lastIndexOf(" "));
        String name2 = o.fullName.substring(o.fullName.lastIndexOf(" "));
        return name1.compareTo(name2);
        //return studentID.compareTo(o.studentID);// sap xep theo studentID tang dan
        //return o.studentID.compareTo(studentID);// sap xep tang dan
        //Note: Quy luat- if return value greater than 0 the swap
    }
//    @Override
//    public String toString() {
//        return getClass().getName()+"["+"FullName: "+fullName+" ID: "+ID+" StudentID: "+studentID+
//                " Universty: "+univerName+" avgMark: "+avgMark+"]";
//    }
}
