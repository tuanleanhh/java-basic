package From1to28;/*
    - string la bat bien: khong the thay doi ky tu nao khi da dinh nghia string
    - kiem tra hai chuoi tuong duong
    - chuoi rong va null
 */


public class b14stringrongNull {
    public static void main(String[] args) {
        String  firstString = "Le";
        String secondString = "Tuan";
        String thirdString = "Tuan";
        String fourthString = "tuan";
        //System.out.println(secondString == thirdString); nen su dung equal so sanh string
        System.out.println(secondString.equalsIgnoreCase(fourthString));
        // so sanh khong pb chu hoa thuong thi su dung equalsIgnorcase
        String emptyString = ""; //chuoi rong
        String nullString = null; // chuoi null, khong dem thao tac duoc.
        //System.out.println(emptyString.length());
        System.out.println(nullString.length());
        /*
                -truoc khi thao tac 1 doi truong trong java ta phai kiem tra xem co bi null hayko
         */
    }
}
