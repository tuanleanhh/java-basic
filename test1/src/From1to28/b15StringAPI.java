package From1to28;// gioi thieu string Api( cac phuong thuc string)



public class b15StringAPI {
    public static void main(String[] args) {
//        String a;
        String myName = "Le Tuan Dep Trai";
        String note = "Le";
//        a = myName.toLowerCase(); //chuyen sang mang ky tu char
//        System.out.println(a);
//        System.out.println(myName.toCharArray());
//        String res[] = myName.split(" "); // tach chuoi thanh cac chuoi nho sau moi dau cach
//        for(String s: res)
//            System.out.println(s);
        System.out.println(myName.startsWith(note));//kiem tra chuoi co bat dau bang chuoi note
        System.out.println(myName.startsWith("le"));
        System.out.println(myName.endsWith(note));// kiem trai xem co ket thuc bang chuoi note k
        System.out.println(myName.split(" ",2));

    }
}
