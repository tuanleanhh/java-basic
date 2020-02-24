package model;

import java.util.Scanner;

public class Funny {
    public static void xuatDL(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static boolean check(int m, int n) {
        boolean kt = m <= 0 || n <= 0;
        return kt;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap M");
        int m = scanner.nextInt();
        System.out.println("Nhap N: ");
        int n = scanner.nextInt();
        while (check(m, n) == true) {
            System.out.println("Sai dinh dang, Nhap lai!!");
            System.out.println("Nhap M");
            m = scanner.nextInt();
            System.out.println("Nhap N: ");
            n = scanner.nextInt();
        }
        System.out.println("M = " + m);
        System.out.println("N = " + n);

        if (m <= 0 || n <= 0) {
            System.out.println("M va N phai lon hon 0!");
            System.runFinalization();
        } else {
            xuatDL(m, n);
        }
        System.out.println("Thoi gian chay chuong trinh: " + (System.currentTimeMillis() - start) + "ms");
    }
}
