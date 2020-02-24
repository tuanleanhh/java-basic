package OOP;

import Relationship.A;
import model.B42;

public class Bai42PBietdoituongvabiendoituong {
    public static void main(String[] args) {
        new B42();//tao doi tuong tu class B42
        //B42 a1,a2;//a1,a2 la bien doi tuong
        B42 a1 = new B42();
        B42 a2 = a1;
        System.out.println(a1.toString());// hien thi dia chi cua a1 tham chieu toi
        System.out.println(a2.toString());


    }
}
