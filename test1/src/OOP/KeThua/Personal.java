package OOP.KeThua;

import java.util.Objects;

public class Personal {
    private String fullName;
    private String ID;

    public Personal() {
    }

    public Personal(String fullName, String ID) {
        this.fullName = fullName;
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    protected void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void showInfo() {
        String infor = "Full Name: " + fullName + "\nID: " + getID();
        System.out.println(infor);
    }

    // Equal bai 62
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null) {
            return false;
        }
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }
        // khong cho lop con override them keyword final vao phuong thuc equal ( public final boolean equals..)
//        if(!(otherObject instanceof Personal)){
//            return false;
//        }
        Personal other = (Personal) otherObject; //ep kieu
        return Objects.equals(ID, other.ID)
                && Objects.equals(fullName, other.fullName);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[ID = " + ID + "FullName: " + fullName + "]";
    }
}
