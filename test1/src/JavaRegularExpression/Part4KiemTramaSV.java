package JavaRegularExpression;
//KiemtraDinhdang sinh vien

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4KiemTramaSV {
    public static void main(String[] args) {
        String inptut;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma SV: ");
        inptut = scanner.nextLine();
        String regex = "^[cCqQ]{2}+\\d{2}+[a-zA-Z]{4}+\\d{3}$"; //dinh dang: CQ58QTKD232
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inptut);
        if (matcher.find()){
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect ID, Try Again!");
        }
    }

}
