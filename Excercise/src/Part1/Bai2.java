package Part1;

import java.util.Scanner;

//Nhập vào kích thước chiều rộng, chiều cao và
// in ra hình chữnhật các dấu * nhưng rỗng bên trong. Ví dụvới chiều cao là 5, chiều rộng là 5
public class Bai2 {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1|| j == 0) {
                    System.out.print("|");
                } else if(i == m - 1 || i == 0 ) {
                    System.out.print("_");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
