package DateAndTime;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

// Lop Local Date : su dung voi khoang thoi gian lon hon ngay!
public class Part3LopLocalDate {

    public static void main(String[] args) {
       Date date = new Date();
        LocalDate localDate = LocalDate.now(); // lay thoi gian tai thoi diem hien tai
        LocalDate mydate = LocalDate.of(2019,12,25);
        System.out.println(localDate);
        System.out.println("My date: "+mydate);
        localDate =  localDate.plusDays(303); //tang them ngay
        System.out.println("New date:  "+localDate);
        System.out.println(localDate.atTime(20,30));
    }
}
