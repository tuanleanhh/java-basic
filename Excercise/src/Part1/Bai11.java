package Part1;

import java.util.Scanner;

/*
Viết chương trình liệt kê n số nguyên tố đầu tiên.
 */
public class Bai11 {
    public static void main(String[] args) {
        String a = "Nhap n so nguyen to muon tim: ";
        System.out.printf("%5s", a);
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        int x = 2;
        while (true) {
            if (isNgto(x)) {
                System.out.print(x + " ");
                count++;
                if(count%20==0){
                    System.out.println();
                }
            }

            if (count == n) {
                break;
            }
            if (x == 2) {
                x++;

            } else {
                x += 2; // cac so nguyen to hau het la so le tru so 2. cau lenh de duyet nhanh hon

            }
        }
    }
    public static boolean isNgto(int n) { //check xem co phai so nguyen to hay ko
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; //kp so ngto
            }
        }

        return true;// la so nguyen to
    }
}
