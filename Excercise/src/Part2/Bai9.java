package Part2;
/*
    Viết chương trình tính tích  2  ma trận các số nguyên A [m][n] và  B[n][k].
 */

import java.util.Random;

public class Bai9 {
    public static int[][]nhanMang(int[][]a,int[][]b){
        int m = a.length;
        int n = a[0].length;
        int k = b[0].length;
        int[][]c = new int[m][k];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <k ; j++) {
                int sum = 0;
                for (int l = 0; l < n; l++) {
                    sum =sum+ a[i][l]*b[l][j];
                }
                c[i][j]=sum;
            }
        }
        return c;
    }
    public static void xuatMang(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"  ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m =new Random().nextInt(5) + 3;
        int n =new Random().nextInt(5) + 3;
        int k =new Random().nextInt(5) + 3;
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][]c;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = new Random().nextInt(10);

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                b[i][j] = new Random().nextInt(10);
            }
        }
        System.out.println("Ma tran A:");
        xuatMang(a);
        System.out.println("____________________________________");
        System.out.println("Ma tran B:");
        xuatMang(b);
        c=nhanMang(a,b);
        System.out.println("_____________________________");
        System.out.println("Ma tran AxB:");
        xuatMang(c);

    }
}
