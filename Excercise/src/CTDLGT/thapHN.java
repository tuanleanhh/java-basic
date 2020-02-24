package CTDLGT;

import java.util.Scanner;

public class thapHN {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap n: ");
        n = new Scanner(System.in).nextInt();
        String a = "A";
        String b = "B";
        String c = "C";
        thapHN(n,a,b,c);
    }
    public static void chuyen(int n, String a, String b){
        System.out.println("Chuyen dia thu "+n+" tu coc "+a+" sang coc "+b);

    }

    public static void thapHN(int n,String a, String b, String c){
        if (n==1){
            chuyen(1,a,c);
        }else {
            thapHN(n-1,a,c,b);
            chuyen(n,a,c);
            thapHN(n-1,b,a,c);
        }
    }
}
