package Part1;

import java.util.Scanner;

/*
Viết chương trình tính tổng S= 1+3+5+ ...+ n nếu n lẻ
S= 2 + 4 + ... + n nếu n chẵn
 */
public class Bai6 {
    public static void main(String[] args) {
        int n;
        int SL = 0;
        int SC = 0;
        Scanner scanner = new Scanner(System.in);
        String a = "Nhap n: ";
        System.out.printf("%5s", a);
        n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                SC = SC + i;
            } else {
                SL = SL + i;
            }

        }
        System.out.println("Tong so chan la: \n" + SC);
        System.out.println("Tong so le la: \n" + SL);

    }
}
