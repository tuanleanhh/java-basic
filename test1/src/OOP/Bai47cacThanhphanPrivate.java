package OOP;
/*
    Cac thanh phan private, tinh dong goi du lieu:
     - thanh phan private chi trong lop moi co the su dung
 */

import model.Person;

public class Bai47cacThanhphanPrivate {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Le AnhTuan");
        System.out.println(person.getName());
        System.out.println();
        System.out.println(person.getFullName());
    }
}
