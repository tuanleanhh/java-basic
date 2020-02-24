package JavaRegularExpression;
/*
    Su dung regular expression de:
        - Tim kiem gan dung
        - Thay the mot cum ky tu boi ky tu khac
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2TimkiemThaythe {
    public static void main(String[] args) {
//        String[] fullName = {"Tran Van Thanh", "Nguyen Van An", "Ngo Bao Chau", "To Ngoc Minh", "Pham Huu Duc"};
        //tim kiem gan dung
        //String regex = ".*Ngo.*"; // co khong hoac nhieu ky tu dang truoc hoac sau Ngo
        //String regex = "^Tran"; // bat dau bang chu Tran
//        String regex = "n$"; // ket thuc bang chu n
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher;
//        for (int i = 0; i < fullName.length; i++) {
//            matcher = pattern.matcher(fullName[i]);
//            if (matcher.find()){
//                System.out.println(fullName[i]);
//            }
//
//        }
        //Thay the cum ky tu bang ktu khac
        String input = "      Hello      abc       xyz     mfmf";
        String regex = "[\\s]+"; // thay the dau cach [\\s]
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            System.out.println(matcher.replaceAll(".")); // thay the dau cach boi ktu khac
        }
    }

}
