package Part2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
    Đọc vàodãy số a có n phần tửchỉ gồm các số nguyên dương
    .Kiểm tra mảng a có phải là mảng đối xứng hay không (ví dụ: 15 2 1 2 15 là mảng đối xứng).
 */
public class Bai1 {
    // xoa ky tu dau va trong String
    public static String removeCharAt(String s, int pos) {
        return s.substring(1, pos);
    }
//
    public static void daoNguoc(String a1) {
        String old = new String(a1);
        String reverse = new StringBuffer(a1).reverse().toString();
        System.out.println(old);
        System.out.println(reverse);
        System.out.println(old.compareToIgnoreCase(reverse));
//        if (old.compareTo(reverse) == 1) {
//            System.out.println("La mang doi xung!\n");
//        } else {
//            System.out.println("Khong la mang doi xung");
//        }

    }

    public static int[] nhapMang(int n, Scanner scanner) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        return a;
    }

    public static void xuatDL(int[] xdl) {
        System.out.println("  Day so la: ");
        for (int i = 0; i < xdl.length; i++) {
            System.out.print(xdl[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap day so a gom " + n + " chu so: ");
        a = nhapMang(n, scanner);
        //xuatDL(a);
        String b = Arrays.toString(a);
        //b=removeCharAt(b,0);
        b=removeCharAt(b, b.length()-1);
        String c = b.substring(b.length()-1);
        System.out.println(b);
       //daoNguoc(b);
//_______________________________________
        //Cach2
//        boolean check = true;
//        int mid = n/2;
//        int x;
//        for (int i = 0; i <mid ; i++) {
//            x = n-1-i;
//            if (a[i]!=a[x]){
//                check = false;
//                break;
//            }
//        }
//        if(check==true){
//            System.out.println("Mang doi xung!\n");
//        }else {
//            System.out.println("Mang khong doi xung!");
//        }

    }
}
