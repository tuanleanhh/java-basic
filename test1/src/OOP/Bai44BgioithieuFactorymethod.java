package OOP;
/*
    Factory Method:
        -sinh ra cac doi tuong khong can constructor
        -thay the viec khoi tao doi tuong 1 cach truc tiep
 */

import model.PersonFactory;
import model.StudentClassB37;

import java.text.NumberFormat;

public class Bai44BgioithieuFactorymethod {
    public static void main(String[] args) {
//        NumberFormat currencyForm = NumberFormat.getCurrencyInstance();
//        NumberFormat percentageForm = NumberFormat.getPercentInstance();
//        double x = 0.5;
//        System.out.println(percentageForm.format(x));
//        System.out.println(currencyForm.format(x));
        StudentClassB37 student1 = PersonFactory.getStudentInstance();
        StudentClassB37 student2 = PersonFactory.getStudentInstance();
        StudentClassB37 student3 = PersonFactory.getStudentInstance();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
