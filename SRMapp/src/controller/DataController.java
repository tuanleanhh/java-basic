package controller;

import model.Student;
import model.Subject;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Loi File!");
        }

    }

    public void openFileToRead(String fileName) {

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName)); // doc file
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Loi File!");
        }
    }

    public void closeFileAfterRead(String fileName) {
        try {
            this.scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi File!");
        }
    }

    public void writeStudentToFile(Student student, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(student.getStudentID() + "|" + student.getFullName()
                + "|" + student.getAddress() + "|" + student.getPhoneNumber());
        closeFileAfterWrite(fileName);
    }

    public void writeSubjectToFile(Subject subject, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(subject.getSubjectID() + "|" + subject.getSubjectName()
                + "|" + subject.getTotalLesson() + "|" + subject.getSubjectType());
        closeFileAfterWrite(fileName);
    }

    public void closeFileAfterWrite(String fileName) {
        try {
            this.printWriter.close();
            this.bufferedWriter.close();
            this.fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi File!");
        }
    }

    public Subject creatSubjectFromData(String data) {
        String[] datas = data.split("\\|");
        //public Subject(int subjectID, String subjectName
        //            , int totalLesson, String subjectType)

        Subject subject = new Subject(Integer.parseInt(datas[0])
                , datas[1], Integer.parseInt(datas[2]), datas[3]);

        return subject;
    }

    public Student creatStudentFromdata(String data) {
        String[] datas = data.split("\\|");
        //public Student(int studentID, String fullName
        //            , String address, String phoneNumber)
        Student student = new Student(Integer.parseInt(datas[0]), datas[1],
                datas[2], datas[3]);
        return student;
    }

    public ArrayList<Subject> readSubjectFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Subject> subjects = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Subject subject = creatSubjectFromData(data);
            subjects.add(subject);
        }
        closeFileAfterRead(fileName);
        return subjects;
    }

    public ArrayList<Student> readStudentFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList students = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Student student = creatStudentFromdata(data);
            students.add(student);
        }
        return students;
    }


}
