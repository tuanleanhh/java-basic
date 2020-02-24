package java_interface;
/*
        Interface trong java
        Muc dich: de dat duoc tinh truu tuong hoan toan.
        tuong tu nhu abstrac, interface de ra nhung phuong thuc nhung khong thuc hien phuong thuc ay
        cac phuong thuc trong interface mac dinh la public absrtac nen k can khai bao
        keyword implements tuong duong vs extend nhung dung voi interface
        co the da ke thua doi voi interface
        thuoc tinh mac dinh la final hoac static
 */

import java_interface.Example.Animal;
import java_interface.Example.Cat;
import java_interface.Example.Dog;

public class Bai69Khainiemhoacachsudung {
    public static void main(String[] args) {
        Animal animal = new Dog();
        var animal2 = new Cat();

        animal.eat();
        animal2.move();
    }
}
