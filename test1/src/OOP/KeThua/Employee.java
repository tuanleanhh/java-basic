package OOP.KeThua;

import java.util.Objects;

public class Employee extends Personal {
    private float sallary;
    private String eID;
    private String role;

    public Employee() {

    }

    public Employee(float sallary, String eID, String role) {
        this.sallary = sallary;
        this.eID = eID;
        this.role = role;
    }

    public Employee(String fullName, String ID, float sallary, String eID, String role) {
        super(fullName, ID);
        this.sallary = sallary;
        this.eID = eID;
        this.role = role;
    }

    public Employee(String fullName, String ID) {
        super(fullName, ID);
    }

    public float getSallary() {
        return sallary;
    }

    public void setSallary(float sallary) {
        this.sallary = sallary;
    }

    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void showInfo() {
        //super.showInfo(); // goi den phuong thuc o lop cha
        System.out.println("Full Name"+super.getFullName());
        System.out.println("ID: "+super.getID());
        System.out.println("Employee ID: " + eID + "\nRole: " + role + "\nSallary: " + sallary);
    }

    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject)){
            return false;
        }
        Employee employee = (Employee) otherObject;
        return sallary == employee.sallary // kieu nguyen thuy dung ==
        && Objects.equals(eID,employee.eID) && Objects.equals(role,employee.role);
    }

    @Override
    public String toString() {
        return super.toString()+"["+"EmployeeID: "+eID+"role: "+role+"Salary: "+sallary;
    }
}
