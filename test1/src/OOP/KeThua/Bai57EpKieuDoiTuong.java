package OOP.KeThua;
/*
        Ép kiểu đối tượng, down casting
 */

public class Bai57EpKieuDoiTuong {
    public static void main(String[] args) {

        Employee employee = new Employee("Le Tuan", "11165699",23.5f,"B165965","Director");
        Student student = new Student("LEeee","036586660","032566330","KTQD","3.24");

        Personal personal = new Personal("Le Tam","111656999");

        Personal [] people = new Personal[3];
        people[0]=personal;
        people[1]=student;
        people[2]=employee;

        Student st1 = null;
        Employee em1= null;
        //Ep kieu su dung toan tu instanceof
        for (var p: people
             ) {
            if(p instanceof Student){
                st1 = (Student) p;
            }
            if(p instanceof Employee){
                em1 = (Employee) p;
            }

        }
        if (em1!=null){
            em1.setFullName("Hoang Tan");
            em1.setSallary(3.25f);
        }
        System.out.println("Employee:");
        em1.showInfo();
        if (st1!=null){
            st1.setAvgMark("6.655");
        }
        System.out.println("Student:");
        st1.showInfo();


    }
}
