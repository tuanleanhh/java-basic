package DateAndTime;

import java.util.Date;

/*
        Chuyen doi dinh dang thoi gian;
 */
public class Part4ChuyenDoiDinhDangTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%tA %<td/%<tB/%<tY   %<tT   %<tz %<tZ",date); // dinh dang ngay
    }
}
