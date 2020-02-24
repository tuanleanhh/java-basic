package DateAndTime;
/*
    -Lop simple date format
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Part2LopSimpleDateFormat {
    public static void main(String[] args) {
        Date date = new Date() ;
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd/MM/YY HH:mm:ss::SS z");
//        String time = simpleDateFormat.format(date);
////        System.out.printf(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String input    = new Scanner(System.in).nextLine();
        //String input = "11/03/1998";
        try {
            date = simpleDateFormat.parse(input); // nhap vao ngay thang thong qua ham String
            System.out.println(simpleDateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Khong dung dinh dang!!");
        }


    }

}
