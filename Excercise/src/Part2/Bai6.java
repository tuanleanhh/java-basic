package Part2;
/*
Nhập số liệu  cho dãy số nguyên a0, a1,..., an-1   và  một giá trị x.
Giả sử dãy  a đã được sắp xếp theo thứ tự tăng dần.
Hãy chèn  giá trị  x vào dãy  a sao cho vẫn giữ được tính sắp xếp của mảng.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai6 {
    public static int[] nhapMang(int n, Scanner scanner) {
        int[] mang = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mang[i] = random.nextInt(10);
        }
        return mang;
    }

    public static void main(String[] args) {
        int[] a;
        System.out.println("Nhap X: ");
        int x = new Scanner(System.in).nextInt();
        int n = new Random().nextInt(6) + 2;
        Scanner scanner = new Scanner(System.in);
        int[] b = new int[n + 1];
        a = nhapMang(n, scanner);
        Arrays.sort(a);
        System.out.println("Day a truoc khi them X:");
        System.out.println(Arrays.toString(a));
        int[] c = {x};
        int index = -1;
        for (int i = 0; i <n ; i++) {
            if(a[i]>x){
                index=i;
                break;
            }
        }
        if(index==-1){ //chen ptu vao cuoi
            for (int i = 0; i <n ; i++) {
                b[i] = a[i];
            }
            b[n]=x;
            //chen vao vi tri khac
        }else {
            for (int i = 0; i < n; i++) {
                b[i]=a[i];
                
            }
            for (int i = n; i >index; i--) {
                b[i] = b[i-1]; // dich phai cac phan tu tu vi tri index
            }
            b[index]=x;
        }
        System.out.println(Arrays.toString(b));

    }

}

