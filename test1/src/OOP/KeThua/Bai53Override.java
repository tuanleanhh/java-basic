package OOP.KeThua;
 /*
    Override: Dinh nghia lai phuong thuc cua lop cha cho phu hop voi lop con.
  */
public class Bai53Override {
    public static void main(String[] args) {
        Employee employee = new Employee("Le Tuan", "11165699",23.5f,"B165965","Director");
        Student student = new Student("LEeee","036586660","032566330","KTQD","3.24");

        Personal personal = new Personal("Tran Dan","09652232");
        System.out.println("Thong tin person: ");
        personal.showInfo();
        System.out.println();
        System.out.println("Student:");
        student.showInfo();
        System.out.println();
        System.out.println("Employee");
        employee.showInfo();
    }
}
