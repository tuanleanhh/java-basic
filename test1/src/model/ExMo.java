package model;

import java.util.Scanner;

public class ExMo {
    public static void main(String[] args) {
        int[] tien = {500000,200000,100000,50000,20000,10000,5000,2000,1000,500};
        int sotien,to;
        System.out.println("Nhập vào số tiền cần đổi: ");
        sotien = new Scanner(System.in).nextInt();
        for (int i = 0; i < tien.length; i++) {
            to = sotien/tien[i];
            if (to!=0){
                System.out.print(to+" tờ "+tien[i]+"VND"+", ");
            }
            sotien = sotien%tien[i];
        }
    }
}
