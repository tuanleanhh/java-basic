package Part1;

import java.util.Scanner;

/*
Dãy số Fibonacci được định nghĩa như sau: F0 = 0, F1 = 1; Fi = Fi-1 + Fi-2.
Nhập n, với 2 <= n <= 90. Hãy viết chương trình in ra n số Fibonacci đầu tiên.
 */
public class Bai12 {
    public static void main(String[] args) {
        String a = "Nhap n: ";
        System.out.printf("%5s", a);
        int n = new Scanner(System.in).nextInt();
        long f0 = 0, f1 = 1, fn = 0;
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                System.out.println(i);
            } else {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                System.out.println(fn);
            }
        }

    }
}
