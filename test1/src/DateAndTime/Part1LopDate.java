package DateAndTime;
/*
        Gioi thieu lop date trong Java
 */

import java.util.Date;

public class Part1LopDate {
    public static void main(String[] args) {
        long miliSecond = System.currentTimeMillis();// lay ra milisecond
        Date now = new Date();
        long nowMs = now.getTime(); // chuyen doi sang milisecond
//        System.out.println(nowMs); // xuat ra milisecond
//        System.out.println(miliSecond);
        Date tomorrow = new Date(miliSecond+(24*60*60*1000));
        Date yesterday1000 = new Date(miliSecond-(24*60*60*1000)*1000L);

        System.out.println(yesterday1000);
        System.out.println(now);
        System.out.println(tomorrow);
        System.out.println(now.before(yesterday1000));//so sanh dung before(tomorow se tra ve true) hoac after(tomorow se false)
    }
}
