package model;

import java.util.Calendar;
import java.util.Scanner;

public class DoiTien {
    // Phương thức strs dùng để ép kiểu int sang String để thêm dấu "."
    public static String strs (int b){
        String str = Integer.toString(b);
        int a = str.length();
        while (a-3>0){
            int i = a - 3;
            str = new StringBuilder(str).insert(i,".").toString();
            a = i;
        }
        return str;
    }
    // Phương thức doitien chuyển đổi số tiền nhập về các mệnh giá muốn đổi
    public static void doitien(int n, int sotien) {
        int to;
        int check;
        int[] tien = {500000, 200000, 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500};
        check = sotien/tien[n];
        if (check == 0){
            System.out.println("Số tiền không đủ, nạp thêm tiền và chọn lại!");
            System.exit(0);
        }else {
            for (int i = n; i < tien.length; i++) {
                to = sotien / tien[i];
                if (to != 0) {
                    System.out.print(to + " tờ " + strs(tien[i]) + " VND" + ", ");
                }
                sotien = sotien % tien[i];
            }
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Nạp vào số tiền bạn muốn đổi?");
        Scanner scanner = new Scanner(System.in);
        int sotien = new Scanner(System.in).nextInt();
        String s = strs(sotien);
        System.out.println("Bạn đã nạp vào số tiền: "+s+" VND");
        int to;
        // Menu
        do {
            System.out.println();
            System.out.println("____________________________________MENU__________________________________");
            System.out.println("Chọn mệnh giá bạn muốn đổi: ");
            System.out.println("1. 500.000 VND");
            System.out.println("2. 200.000 VND");
            System.out.println("3. 100.000 VND");
            System.out.println("4. 50.000 VND");
            System.out.println("5. 20.000 VND");
            System.out.println("6. 10.000 VND");
            System.out.println("7. 5000 VND");
            System.out.println("8. 2000 VND");
            System.out.println("9. 1000 VND");
            System.out.println("0.Exit");
            System.out.println("Bạn chọn?");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("________________________________________________________________");
                    System.out.println("Cảm ơn đã sử dụng dịch vụ!");
                    break;
                case 1:
                    doitien(0, sotien);
                    break;
                case 2:
                    doitien(1, sotien);
                    break;
                case 3:
                    doitien(2, sotien);
                    break;
                case 4:
                    doitien(3, sotien);
                    break;
                case 5:
                    doitien(4, sotien);
                    break;
                case 6:
                    doitien(5, sotien);
                    break;
                case 7:
                    doitien(6, sotien);
                    break;
                case 8:
                    doitien(7, sotien);
                    break;
                case 9:
                    doitien(8, sotien);
                    break;
            }
        } while (choice != 0);
    }
}
