package Part1;
/*
Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
    Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        String a = "Nhap vao so n: ";
        System.out.printf("%5s", a);
        int n = new Scanner(System.in).nextInt();
        int i = 2;
        if (n == 1) {
            System.out.println(n + " = " + n);
        } else {
            System.out.print(n + " = ");
            while (n != 1) {
                if (n % i == 0) {
                    System.out.print(i + " x ");
                    n /= i;
                } else {
                    i++;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}
