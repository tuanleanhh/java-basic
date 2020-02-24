package JavaRegularExpression;

/*
    Kiem tra dinh dang email:
    tuanleanhh@gmail.com
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3KiemTraEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap email: ");
        String input = scanner.nextLine();
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}+[A-Za-z]+mail.com$"; //viet pattern dinh dang email email
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("Correct!");

        }else {
            System.out.println("Try Again!");
        }

    }
}
