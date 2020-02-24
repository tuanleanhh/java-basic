package JavaRegularExpression;

///kiem tra dinh dang so dien thoai
 //VD:(032).8937.373

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part5KtraDinhDangSDT {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dien Thoai: ");
        input = scanner.nextLine();
        String regex = "^\\([0]\\d{2}\\)\\-(\\d{4})\\-(\\d{3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect!");
        }

    }



}
