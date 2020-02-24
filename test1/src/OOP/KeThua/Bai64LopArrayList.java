package OOP.KeThua;
    /*
    Lop ArrayList: so phan tu tu dong thay doi theo so phan tu nhap vao. khong luu duoc kieu du lieu nguyen thuy.
    chi luu kdc kieu doi tuong
     */

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bai64LopArrayList {
    public static void main(String[] args) {
        String[] strs = new String[10]; // mang co san 10 phan tu
        ArrayList list = new ArrayList(100); // khong can xd truoc phan tu tru khi biet chac so phan tu
        //list.ensureCapacity(100); // biet truoc so phan tu. xac dinh so
        ArrayList<String> list1 = new ArrayList<String>(); // xac dinh kieu cua ArrayList
        list.add("ABC");  //them phan tu
        list.add(new Student());
        list.add(new Object());
        list1.add("ADD");
        list1.add("XBV");

        // chen vao vi tri bat ki trong khoang tu 0-size-1:
        list1.add(1,"XDX");

        //thay doi phan tu o vi tri bat ki bang phan tu khac
        list1.set(2,"Tuan");

        //xoa phan tu
        list1.remove("Tuan");

        System.out.println("Size Array: "+strs.length);
        System.out.println("Size ArrayList: "+list.size());

        for (var b:list1
             ) {
            System.out.println(b);
        }

//        String s1 = list1.get(0); // lay phan tu trong mang
//        String s2 = list1.get(1);
    }
}
