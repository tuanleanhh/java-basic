package Part1;

import java.util.Scanner;

/*
Nhập một sốc>0 (ví dục = 0.00001) rồi tính sốtheo công thức:
= 4* (1-31+51-71+...+(-1)n121+n)tổng được tính với n  đủlớn sao cho bất đẳng thức  121+nc   thỏa mãn.
 */
public class Bai15 {
    public static void main(String[] args) {
        System.out.println("Nhap c: " );
        double c = new Scanner(System.in).nextDouble();
        double pi = 0;
        int n = 0;
        double x = 1.0/(n*2+1);
        while (c<=x){

            pi+=Math.pow(-1,n)*x;
            n++;
            x=1.0/(2*n+1);

        }
        pi*=4;
        System.out.println("PI = "+pi);

    }
}
