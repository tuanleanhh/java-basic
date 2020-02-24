package model;

public class StudentClassB37 {
    private String studentID;
    private int studentYears;
    private float studentAVGMark;
    private String falcuty;
    public static int id = 1000; //truong static b43

    public StudentClassB37(String studentID,int studentYears){ //phuong thuc 1// ;
        this.studentID = studentID;
        this.studentYears=studentYears;

    }
//    public StudentClassB37(String studentID, int studentYears, float studentAVGMark, String falcuty) {
//        //tham so truyen vao trung voi ten thuoc tinh class
//        // de phan biet ta them this.
//        this.studentID = studentID;
//        studentYears = studentYears; // bi trung ten
//        this.studentAVGMark = studentAVGMark;// da phan biet
//        falcuty = falcuty;
//    }
    public StudentClassB37(String studentID, int studentYears, float studentAVGMark, String falcuty) {
        // goi phuong thuc khac: (this.. . phai luon la dong dau tien)

        this(studentID,studentYears);// goi phuong thuc 1
//        this.studentID = studentID;
//        this.studentYears = studentYears;
        this.studentAVGMark = studentAVGMark;
        this.falcuty = falcuty;


}// cach tao constructor nhanh

    // tao thuoc tinh
    public StudentClassB37() {


    } // moi class deu co 1 constructor ngam dinh. day la constructor ngam dinh cua StudentClassB37
    public StudentClassB37(String studentID){

    }
    public StudentClassB37(float studentAVGMark){

    }
    public void goToSchool() {

    }

    public void study() {

    }

    public void doExam() {

    }

    public void seeStudentResult() {

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        studentID = studentID;
    }

    public int getStudentYears() {
        return studentYears;
    }

    public void setStudentYears(int studentYears) {
        this.studentYears = studentYears;
    }

    public float getStudentAVGMark() {
        return studentAVGMark;
    }

    public void setStudentAVGMark(float studentAVGMark) {
        this.studentAVGMark = studentAVGMark;
    }

    public String getFalcuty() {
        return falcuty;
    }

    public void setFalcuty(String falcuty) {
        this.falcuty = falcuty;
    }
}
