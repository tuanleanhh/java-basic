package Part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    Nhập 2 mảng a[N]và b[M]và số nguyên p (0≤p<N). Hãy chèn mảng b[]vào vị trí p của a[]
    .  Ví dụ: a[4]: 5 3 6 7; b[3]: 2 9 11; p= 1 →a[7]: 5 2 9 113 6 7
 */
public class Bai5 {
    public static int[] nhapMang(int n, Scanner scanner) {
        int[] mang = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mang[i] = random.nextInt(10);
        }
        return mang;
    }

    public static void main(String[] args) {
        int[] a, b;
        System.out.print("Nhap vao n phan tu cua mang a: \n");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhap vao m phan tu cua mang b: \n");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhap vao vi tri p: \n");
        int p = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);
        int k=m+n;
        int[] a1 = new int[m + n];
        a = nhapMang(n, scanner);
        System.out.println(Arrays.toString(a));
        b = nhapMang(m, scanner);
        System.out.println(Arrays.toString(b));
        //copy den vi tri p cua mang a vao mang a1
        for (int i = 0; i < p ; i++) {
            a1[i]=a[i];
            
        }
        //copy mang b vao mang a1
        for (int i = 0; i < m ; i++) {
            a1[i+p] = b[i]; // vi da copy p phan tu tu mang a nen se la a1[i+p]

        }
        //copy phan con lai cua mang a vao a1
        for (int i = p; i < n; i++) {
            a1[i+m] = a[i]; // vi i = p, va da copy m phan tu tu mang b nen se la a1[i+m]

        }
        System.out.print(Arrays.toString(a1));

    }

}

