package From29to35;
/* ggioi thieu lop Arrays:
                          sap xep mang
                          dien cac phan tu vao mang
                          so sanh 2 mang
                          tim kiem nhi phan
                          copy mang sang mangkhac
 */

import java.util.Arrays;
import java.util.Collections;

public class bai34LopArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 8, 8, 85, 5, 6464, 54, 5, 54, 5, 45, 4, 5, 6, 5, 4};
        String[] name = {"X", "B", "F", "D", "L"};
        Arrays.sort(arr, Collections.reverseOrder());
        String res = Arrays.toString(arr);
        System.out.println(res);

//        Arrays.sort(name, Collections.reverseOrder());
//        // muon sap xep theo tu tu giam dan thi mang phai la mang cua doi tuong VD String,Integer...
//        //int index = Arrays.binarySearch(name,"F"); tim kiem
//        int index = Arrays.binarySearch(name,1,name.length,"F"); // tim kiem trong khoang
//        System.out.println("Da sap xep:");
//        System.out.println(Arrays.toString(name));
//        System.out.println("Index: "+index); //tra ve gia tri am thi ko tim thay, nguoc lai se in ra stt cua gia tri timkiem
        //String[]name2=Arrays.copyOf(name,name.length);//copy toan bo ptu
        String[] name2 = Arrays.copyOf(name, 2);//copy 1 phan
        System.out.println("Name: " + Arrays.toString(name));
        System.out.println("Name2: " + Arrays.toString(name2));
        System.out.println("So sanh: " + Arrays.equals(name, name2));//true la giong fale la khong giong
        int[] myArr = new int[20];
        Arrays.fill(myArr,99); //chen gia tri vao mang
        System.out.println("Filled: "+Arrays.toString(myArr));
    }
}
