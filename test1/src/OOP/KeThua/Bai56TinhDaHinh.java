package OOP.KeThua;
    /*
    tinh da hinh: mot bien cua lop cha co the tham chieu den doi tuong cua lop con
     */
public class Bai56TinhDaHinh {
    public static void main(String[] args) {
        Employee employee = new Employee("Le Tuan", "11165699",23.5f,"B165965","Director");
        Student student = new Student("LEeee","036586660","032566330","KTQD","3.24");

        Personal personal = new Personal("Le Tam","111656999");

        Personal [] people = new Personal[3];
        people[0]=personal;
        people[1]=student;
        people[2]=employee;

        for (Personal p: people
             ) {
            System.out.println("Show info");
            p.showInfo();
            System.out.println();
        }
    }
}
