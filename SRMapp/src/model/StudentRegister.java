package model;

import java.util.Date;

public class StudentRegister {
    private Student student;
    private Subject subject;
    private int totalSubject;
    private Date date;

    public StudentRegister() {
    }

    public StudentRegister(Student student
            , Subject subject, int totalSubject, Date date) {
        this.student = student;
        this.subject = subject;
        this.totalSubject = totalSubject;
        this.date = date;
    }
}
