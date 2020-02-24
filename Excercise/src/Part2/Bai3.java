package Part2;

import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.Scanner;

/*
    Đọc vàomột dãy số a có n phần tử là các số nguyên.
     Nhập vào một số X.Xác định vị trí của số nguyên tố trên a có giá trị gần với X nhất
 */
public class Bai3 {
    public static void main(String[] args) {
        int n, x;
        int min = Integer.MAX_VALUE;
        int index = -1;// -1 la chi so cua phan tu ko ton tai trong mang. neu xet duyet xong maf index van bang -1 thi k co gia trij thoaman
        System.out.println("Nhap n:");
        n = new Scanner(System.in).nextInt();
        System.out.println("Nhap X: ");
        x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao day so a co " + n + " phan tu:");
        int[] a = new int[n];
        //int[] res = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        //ktra tim kq
        for (int i = 0; i < n; i++) {
            int cm = getMin(a[i], x);
            if (ngTo(a[i]) && cm < min) {
                min = cm;
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Chi so phan tu: " + index + ",Gia tri = " + a[index]);

        } else {
            System.out.println("Khong ton tai gia tri thoa man!");
        }
    }

    public static int getMin(int c, int d) {
        return Math.abs(c - d);//lay gia tri tuyet doi
    }

    public static boolean ngTo(int n) {
        if (n<2){
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }


}
