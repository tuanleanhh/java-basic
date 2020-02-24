package Part2;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Viết chương trình nhập số liệu cho ma trận các số nguyên A  cấp   mxn
trong đó   m, n là các số tự nhiên. Sau đó tìm ma trận chuyển vị B = (bij)  cấp  nxm, bij= ajii = 1,2,...,n;j =1,2,...,m.
 Hiển thị2 ma trận trên màn hình để tiện so sánh
 */
public class Bai8 {
    public static int[][] chuyenVi(int[][] a, int n, int m) {
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    public static void xuatMang(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] nhapMang(int m, int n, Scanner scanner) {
        int[][] mang = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mang[i][j] = random.nextInt(10);

            }
        }
        return mang;
    }

    public static void main(String[] args) {
        int m = new Random().nextInt(5) + 3;
        int n = new Random().nextInt(5) + 3;
        int[][] a;
        int[][] b;
        System.out.println(m);
        System.out.println(n);
        Scanner scanner = new Scanner(System.in);
        a = nhapMang(m, n, scanner);
        System.out.println("Mang ban dau: ");
        xuatMang(a);
        b = chuyenVi(a, n, m);
        System.out.println("Mang chuyen vi: ");
        xuatMang(b);

    }
}
