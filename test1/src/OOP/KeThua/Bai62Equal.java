package OOP.KeThua;
    /*
        Phương thức equal();
        Xác minh hai đối tượng thuòng là entities có tương đương nhau hay không
        Công thức để viết ra một phương thức equals hoàn hảo: //class Personal
            - Đặt tên tham số là otherObject
            - Check hai đối tượng có trùng nhau hay không
                        if (this == otherObject) return true;
            - Check otherObject có null không:
                        if (otherObject == null) return false;
            - Sử dụng getClass() trong trường hợp mỗi lớp con tự định nghĩa lại phương thức equal():
                        if (getClass() != otherObject.getClass()) return false;
            - Sử dụng instanceof trong trường hợp phương thức equal là final ở lớp cha:
                        if(!(otherObject instanceof ClassName)) return false;
            - Ép kiểu otherObject sang kiểu lớp đang cần so sánh:
                        ClassName other = (ClassName) otherObject
            - Đối sánh các trường với nhau. Nếu kiểu nguyên thuỷ dùng so sánh ==, với kiểu đối tượng dùng Objects.equals():
                        return field1 == other.field1
                        && Object.equals(field2,other.field2)
                        && ....
            - Nếu lớp con tái định nghĩa lại phuong thức equals thì đặt lời gọi super.equals(otherObject)
            trong định nghĩa phương thức này ở lớp con! // class Student va Employee
     */

import model.Person;

public class Bai62Equal {
    public static void main(String[] args) {
        Personal personal1 = new Personal("Le Tuan","11165699");
        Personal personal2 = new Personal("Le Tuan","11165699");
        Personal personal3 = new Personal("Hoang Anh","1116555222");

        System.out.println(personal1.equals(personal1));
        System.out.println(personal1.equals(personal2));
        System.out.println(personal2.equals(personal3));
        System.out.println(personal1.equals(personal3));
    }
}
