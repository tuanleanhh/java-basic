package Part2;
/*
Nhập vào ma trận A[n][m]có các phần tử  là các số nguyên.
Hãy liệt kê trên màn hình tất cả các phần tử của ma trận theo thứ tự tăng dầntừ trái qua phải, từ trên xuống dưới
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Bai10 {
    public static void sapXep(int[][] a) {
        int t;
        int n = a.length;
        int m = a[0].length;
        //int[][] mang = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (a[i][j] > a[i][k]) {
                        t = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = t;
                    }
                }
                for (int k = i + 1; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        if (a[i][j] > a[k][l]) {
                            t = a[k][l];
                            a[k][l] = a[i][j];
                            a[i][j] = t;
                        }

                    }

                }
            }

        }

    }

    public static void xuatMang(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "  ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = new Random().nextInt(5) + 3;
        int m = new Random().nextInt(5) + 3;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = new Random().nextInt(10);
            }
        }
        System.out.println("Ma tran A ( "+n+" x "+m+" ) la:");
        xuatMang(a);
        System.out.println("Ma tran A sau khi sap xep la: ");
        sapXep(a);
        xuatMang(a);

    }
}
