package Part2;
/*
Tạo ngẫu nhiên mảng a[N]gồm các số nguyênsau đó thực hiện:
•Sắp xếp dãy a theo thứ tự tăng dần
•Loại bỏ bớt các phần tử trùng nhau sao cho mỗi giá trị chỉ xuất hiện trong a duy nhấtmột lần
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public static int[] nhapMang(int n,Scanner scanner){
        int[] mang = new  int[n];
        Random random =new Random();
        for (int i = 0; i <n ; i++) {
            mang[i] = random.nextInt(11)+5;

        }
        return mang;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap n:");
        n = new Scanner(System.in).nextInt();
        int[]a;
        Scanner scanner = new Scanner(System.in);
        a=nhapMang(n,scanner);
        int[] b = new int[n];
        boolean isExist = false;
        int bSize = 0;
        for (int i = 0; i < n; i++) {
            //isExist=true;
            for (int j = 0; j < n; j++) {
                if (a[i]==b[j]){
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                b[bSize++]=a[i];
            }
        }
        Arrays.sort(b);
        System.out.println("Day sau khi sap xep va loai cac phan tu trung nhau: \n");
        System.out.println(Arrays.toString(b));

    }
}
