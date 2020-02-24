package Example1;
/*
        Tinh so ngay sai lech giua 2 thoi diem cho truoc
            Huong dan:
            B1: Nhap vao hai gia tri tring
            B2: Chuyen doio cac gia tri dau vao tu String->date qua lop simple date format
            B3: Chuyen 2 thoi diem thanh milysecond
            B4: Lay tri tuyet doi cua hieu hai milisecond
            B5: Chia cho so milisecond trong 1 ngay=>done
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tinhSongaySailech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay bat dau: ");
        String start = scanner.nextLine();
        System.out.println("Nhap ngay ket thuc: ");
        String end = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date startDate = simpleDateFormat.parse(start);//B2
            Date endDate = simpleDateFormat.parse(end);//B2
            Long startValue = startDate.getTime();//B3
            Long endValue = endDate.getTime();//B3
            Long tmp = Math.abs(startValue-endValue);//B4
            Long res = tmp/(1000*60*60*24);
            System.out.println(start+" cach "+end+" "+res+" ngay!");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Sai dinh dang!");
        }


    }
}
