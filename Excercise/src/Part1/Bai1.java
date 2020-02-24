package Part1;
//Bài 1:Nhập vào kích thước
// chiều rộng chiều cao và in ra hình chữnhật các dấu *. Ví dụvới chiều cao là 5, chiều rộng là 5

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        m = scanner.nextInt();
        System.out.println("Nhap chieu rong:");
        n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");//in ra dau *
            }
            System.out.println();//in xuong dong
        }
    }


}
