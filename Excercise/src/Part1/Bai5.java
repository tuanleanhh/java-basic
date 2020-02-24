package Part1;
/*
Bài  5: Viết chương trình nhập  một  sốnguyên  trong  khoảng 0  .. 100. Sau đó lần lượt lấy ngẫu nhiên
 các sốtrong khoảng này cho đến khi có một giá trịđúng bằng giá trịnhập vào.
 In ra kết quảtừng bước và sốbước phải thực hiện.
 */

import java.util.Random;
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {

        int input;
        Scanner scanner = new Scanner(System.in);
        String a = "Nhap vao gia tri: ";
        System.out.printf("%5s", a);
        input = scanner.nextInt();

        int count = 0;
        Random random = new Random();
        while (true) {//vong lap vo han
            int randNumber = random.nextInt(100);//lay ngau nhien so tu 0-99
            count++;
            System.out.println("Random Number: " + randNumber + ", Input: " + input);
            if (randNumber == input) {
                System.out.println("Thuc hien: " + count + " lan.");
                break;
            }
        }

    }
}
