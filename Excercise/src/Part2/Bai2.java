package Part2;
/*
Bài 2.Đọc vàomột dãy số a có n phần tử là các số nguyên. Đếm số lần xuất hiện của từng phần tử trong mảng.
 Inraphần tử và số lần xuất hiện của phần tử có số lần xuất hiện nhiều nhất trong a
 */

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Bai2 {
//    public static int[] nhapMang(int n, Scanner scanner) {
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = new Scanner(System.in).nextInt();
//        }
//        return a;
//    }

    public static void main(String[] args) {
        int count;
        int[] a, res;
        System.out.println("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mang a co " + n + " phan tu: ");
        res = new int[n];
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            res[i] = -1;
        }
        //dem so lan xuat hien cua cac phan tu trong mang
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = 0; j < n; j++) {
                if (res[j] != 0 && a[i] == a[j]) {
                    count++;
                    res[j] = 0;
                }
            }
            if (res[i] != 0) {
                res[i] = count;
            }
        }
        //tim max
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
        // xuat du lieu
        System.out.print("So lan xuat hien Max: " + max + ", cac phan tu: ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max) {
                System.out.print(a[i] + ",");
            }
        }
        System.out.println();

    }
}
