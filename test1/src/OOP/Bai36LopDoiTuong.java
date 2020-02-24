package OOP;

// lop va doi tuong trong java
public class Bai36LopDoiTuong {
    /*
    -lop: duoc coi la khuon, ban ve!
    -doi tuong: la cac thu the duoc tao ra tu khuon, ban ve! // duoc tao ra voi keyword new
     */
    public static void main(String[] args) {
        Person person1,person2; // tao bien person tu class person
        person1 = new Person(); // tao doi tuong
        person2 = new Person();//tao doi tuong
        System.out.println(person1.toString()+"  "+person2.toString());
    }
    //tao lop
    // dua cac dac diem cua thuc the vao khuoon mau(class)
    // lop bao gom thuoc tinh va phuong thuc(hanh vi cua thuc the)

    static class Person {
        private String name;
        private String ID;
        private float salary;
        private String address;
        // phim tat tao getter setter nhanh Ctrl+Alt

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
