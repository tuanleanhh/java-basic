package Part1;
/*
Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
 Ví dụ: Số  8545604 có tổng các chữ số là: 8 + 5 + 4 + 5 + 6 + 0 + 4 = 32.
 */

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        String a = "Nhap vao n: ";
        System.out.printf("%5s", a);
        n = scanner.nextInt();
        int Sum = 0;
        int x;
        while (n > 0) {
            x = n % 10;
            n /= 10;
            Sum += x;

        }
        System.out.println("Sum= " + Sum);
    }

}

