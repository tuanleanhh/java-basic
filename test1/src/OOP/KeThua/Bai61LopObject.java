package OOP.KeThua;
/*
    Lop Object: cha cua moi lop
    Có thể dùng đối tượng hoặc biến của lớp Object để lưu bất kì đối tượng hoặc biến của lớp khác
 */

import javax.management.ObjectName;

public class Bai61LopObject {
    public static void main(String[] args) {
        Object object = new Bai61LopObject();
        Object o1 = new Employee();
        Object o2 = new Student();

        Object[] arr = new Object[2];
        arr[0] = o1;
        arr[1] = o2;
        for (var b: arr
             ) {
            System.out.println();

        }
    }
}
