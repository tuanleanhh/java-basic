package OOP.KeThua;
/*
        Phuong thuc toString

 */

import java.util.logging.Logger;

public class Bai63CuPhaptoString {
    public static void main(String[] args) {
        Student student = new Student("Lee Tuan","09652222222","NEU","11165699","3.65f");

        Personal personal = new Personal("Ho Hao","0632445556");

        Employee employee = new Employee("XAAAA", "02222222",2.24f,"066666666","Leader");
            // Sau khi su dung phuong thuc toString o 3 class de xuat thang ra doi tuong hoac ghi file log
        System.out.println(student);
        System.out.println(personal);
        System.out.println(employee);
        System.out.println();
        System.out.println();

        Logger.getGlobal().info(student.toString());
        Logger.getGlobal().info(employee.toString());
        Logger.getGlobal().info(personal.toString());

    }
}
