package KeywordThis;
/*
        Cach su dung this
 */

public class Student {
    // cac thuoc tính
    private int age;
    private float fee;
    private String name;
    private String ID;

    /**
     *  1. Dung this de tham chieu toi thuoc tinh cua lop hien thoi
     */

    public Student(int age, float fee, String name, String ID) {
        this(age,fee); // goi den constructor o muc 2
//        this.age = age;
//        this.fee = fee;
        this.name = name;
        TestThis testThis = new TestThis(this);
    }
    /**
     * 2. goi constructor
     */
    public Student(int age, float fee) {
        this.setAge(age); // cong dung thu 5
        //this.age = age;
        this.fee = fee;
    }

    public Student(String ID) {
        this.ID = ID;
    }
    /**
     * 3. Dung this de tra ve doi tuong cua lop
     */
    public Student getStudent(){
        return this; // tra ve doi tuong hien thoi cua lop student
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
    /**
     * 4. Dung this de su dung nhu mot tham so
     */
    public void showStInf(){
        var v = new TestThis();
        v.showStudent(this); // this dong vai tro nhu tham so de goi phuong thuc
    }

    /**
     * 5. Dung this de goi phuong thuc khac cua cung lop line 27
     */

    public void setAge(int age){
        this.age=age;
    }
}
