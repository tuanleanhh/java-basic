package Part1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
Bài 7.Nhập sốtựnhiên  n  rồi tính tổng (lưu ý phép chia các sốnguyên):
S =1+21+31+...+n
 */
public class Bai7 {
    public static void main(String[] args) {
        int n;
        double S = 0;
        Scanner scanner = new Scanner(System.in);
        String a = "Nhap so n: ";
        System.out.printf("%5s", a);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            S += (double) 1 / i; // chu y ep kieu

        }
        System.out.printf("Result: %8.3f",S);

    }
}
