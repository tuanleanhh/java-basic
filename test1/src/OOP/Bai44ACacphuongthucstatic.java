package OOP;
/// cac phuong thuc static, gioi thieu factory
//muon truy cap duoc cac hang so trong class phai dua ve truong static
/*
        - khong can co doi tuong de thao tac
        - tat ca nhung gi can thiet da duoc cung cap cho phuong thuc thong qua tham so
        - thao tac voi cac thanh phan static: truong, phuong thuc
        -
 */
public class Bai44ACacphuongthucstatic {
    private static String sth = "SomeThing";
    private static String other= "Other";
    public static void main(String[] args) {
        System.out.println(sth);
        show(150);
        System.out.println(a);

    }
    private static String a = "Hello Word"; // truong static
    public static void show(int n){  // phuong thuc static dung duoc trong ham main
        System.out.println("N: "+n);
    }
    public void shows(int m){ // phuong thuc khog phai static
        System.out.println("M: "+m);
    }

}
