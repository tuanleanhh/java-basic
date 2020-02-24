package Part1;
/*
Nhập vào 2 sốtựnhiên  m và  n, sao cho   m<n.
 Hãy liệt kê các sốchính phươngtrong đoạn[m,n]. Có bao nhiêu sốchính phương?
 */

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        String a = "So luong so chinh phuong: ";
        int count = 0;
        System.out.println("Nhap vao m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao n: ");
        int n = new Scanner(System.in).nextInt();
        if (m > n) {
            System.out.println("Khong dap ung dieu kien(m<n).Dung chuong trinh!");
            return;

        } else if ((m >= 0 && n >= 0) || n >= 0) {
            for (int i = m; i <= n; i++) {
                if (i >= 0) {
                    int res = (int) Math.sqrt(i);
                    if (res * res == i) {
                        System.out.printf("%10d", i);
                        count++;
                        if (count % 10 == 0) {
                            System.out.println("\n");
                        }
                    }
                }
            }
            System.out.println("\n\n");
            System.out.printf("%60s", a + count);
        }


    }
}
