package OOP.KeThua;
/*
        Lop wrapper va autoboxing,unbox:
            - The nao la autoboxing: gan gia tri cua kieu nguyen thuy vao lop bao cua no
            - The nao la unboxed
            - So sanh doi tuong cua lop wrapper
            - Chuyen doi xau cac ki tu so thanh gia tri so tuong
            Note: thuan tien cho viec goi phuong thuc nhung chuong trinh kem hieu qua, ton thoi gian
 */

import java.util.ArrayList;
import java.util.Random;

public class Bai65LopBaoAutoBoxing {
    public static void main(String[] args) {
//        // autoboxing
//        int x = 100;
//        Integer xx = Integer.valueOf(x); // lop bao
//
//        x = xx; // unboxed
//        int a;
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(50);
//        list.add(25);
//        int res = list.get(0)/list.get(1);
//        System.out.println( res );
//        Integer x = Integer.valueOf(1000);
//        Integer y = Integer.valueOf(1000);
//
//        System.out.println(x==y); // khong nen dung de so sanh phan tu co gia tri lon hon -128-128
//        System.out.println(x.equals(y));

        String str = "101001";

        int strNum = Integer.parseInt(str,10); //chuyen doi string sang he 10
        System.out.println(strNum);




    }
}
