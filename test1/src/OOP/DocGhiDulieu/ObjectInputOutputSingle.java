package OOP.DocGhiDulieu;
/*
    ghi đối tượng đơn vào từ file sử dụng ObjectInput/OutputStream
 */

import OOP.KeThua.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectInputOutputSingle {
    public static void main(String[] args) {
        Student student = new Student("Le Tuan","096542245"
                ,"11165699","NEU","3.25f"); // phai them implements Serializable vao class

        // ghi file
        try {
            FileOutputStream fos = new FileOutputStream("STUDENT.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            // dong du lieu de giai phong tai nguyen
            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
