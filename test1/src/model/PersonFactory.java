package model;
 // phuong thuc factory
public class PersonFactory {
    private static StudentClassB37 student = new StudentClassB37();

    public static  StudentClassB37 getStudentInstance(){
        return student; //return gia tri student tai line 4
    }
}
