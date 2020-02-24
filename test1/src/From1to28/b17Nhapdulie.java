package From1to28;//Nhap du lieu tu ban phim

import java.util.Scanner;

public class b17Nhapdulie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao mot so nguyen: ");
//        int a = scanner.nextInt();// doc vao 1 so nguyen
//        System.out.println("Nhap vao 1 so thuc: ");
//        float value = scanner.nextFloat(); //doc vao 1 so thuc
//        System.out.println("Nhap vao so double: ");
//        double b = scanner.nextDouble();
//        double c;
//        System.out.println(c = a+value+b);
        System.out.println("Nhap vao 1 ky tu:");
        char c = scanner.next().charAt(0);// doc vao 1 ky tu bat ky
        System.out.println("Ky tu vua nhap: "+c);

        System.out.println("Nhap vao 1 tu:");
        String word = scanner.next(); // doc vao 1 tu
        System.out.println("tu vua nhap: "+word);
        scanner.nextLine();

        System.out.println("Nhap vao 1 dong");
        String line = scanner.nextLine(); // doc vao 1 dong
        System.out.println("dong vua nhap: "+line);

        System.out.println("Nhap vao gia tri true/false:");
        boolean booleanvalue = scanner.nextBoolean(); //doc vao gia tri boolean
        System.out.println("ban vua nhap: "+booleanvalue);

    }
}
