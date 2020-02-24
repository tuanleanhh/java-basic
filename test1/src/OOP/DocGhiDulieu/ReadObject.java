package OOP.DocGhiDulieu;
// Doc file bang objectStream

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("STUDENTUPDATE2.DAT");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // doc nhieu doi tuong
//            while(fis.available()>0) {
//                obj = ois.readObject();
////                Student obc = (Student)ois.readObject(); //cach 2
////                System.out.println(obc);
//                System.out.println(obj);
//            }
            var resultList = (ArrayList)ois.readObject();
            for (var b:resultList
                 ) {
                System.out.println(b);

            }

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        if (obj == null){
//            System.out.println("Nothing");
//        } else {
//            System.out.println(obj);
//        }
    }
}
