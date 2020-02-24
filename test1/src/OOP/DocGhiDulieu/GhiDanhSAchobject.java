package OOP.DocGhiDulieu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GhiDanhSAchobject {
    public static void main(String[] args) {
        //(String fullName, String ID, String studentID, String univerName, int studentYear, float avgMark)
        Student student = new Student("Le Anh","06546456","11165699","NEU",4,3.25f);
        Student student1 = new Student("Hoa An","03265545","11162455","HUST",4,2.56f);
        Student student2 = new Student("Bao Tra","0562455666","11156665","NEU",4,1.52f);
        Student student3 = new Student("Cao Van","053254645","11163548","Neu",3,0.53f);
        //cach 2: cho object vao list
        var list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        try {
            FileOutputStream fos = new FileOutputStream("STUDENTUPDATE2.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //cach 1:
//            oos.writeObject(student);
//            oos.writeObject(student1);
//            oos.writeObject(student2);
//            oos.writeObject(student3);
            //cach 2:
            oos.writeObject(list);

            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
