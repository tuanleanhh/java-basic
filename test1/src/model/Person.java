package model;

public class Person {
    //public static Person person = new Person();
    private String fullName;
    private String name;
    private String dateOfBirth; // dat modifier la public co the truy cap o bai 46
    private int old;


//    public static Person getPerson() {
//        return person;
//    }

//    public static void setPerson(Person person) {
//        Person.person = person;
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        //splitName();
    }

    //    public Person(String name, String dateOfBirth, int old) {
//        this.name = name;
//        this.dateOfBirth = dateOfBirth;
//        this.old = old;
//    }
//    public static Person getPersonInstance(){
//        return person;
//    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        splitName();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    private void splitName(){
        String[] names = name.split(" ");
        name = "Fist Name: "+names[0]+"\n"+"Last Name: "+names[1];
    }
}
