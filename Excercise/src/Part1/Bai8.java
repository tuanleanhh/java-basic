package Part1;

import java.util.Scanner;

//Nhập sốtự nhiên n rồi liệt kê các ước sốcủa nó. Có bao nhiêu ước số?
public class Bai8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        String a = "Nhap n: ";
        System.out.printf("%5s",a);
        n = scanner.nextInt();
        int count = 0;
        int i =1;
        while (i<=n){
            if (n%i==0){
                System.out.printf("Uoc cua n la: %5d\n",i);
                count++;
            }
            i++;

        }
        System.out.println("So uoc cua n la: "+count);
    }
}
