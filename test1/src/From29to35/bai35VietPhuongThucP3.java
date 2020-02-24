package From29to35;

import java.util.Scanner;

/*
            - Phuong thuc l mot hanh dong nao do
            - Hai kieu phuong thuc:
                    +tra ve :int, float, String,int[],int[][]
                    +khong tra ve: void
 */
public class bai35VietPhuongThucP3 {
    //vd
    //tao phuong thuc tim max
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Nhap du lieu vao
    public static int[] nhapMang(int n, Scanner scanner) {
        //nhapMang(int n(gia tri truyen vao), Scanner scanner(bien su dung lai))
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr; //tra gia tri tuong ung cua kieu phuong thuc(int)
    }
    public static String[]tachTu(String s){
        String[] word = s.split(" ");
        return word;
    }
    //phuong thuc ko tra ve
    public static void showArrRes(String[] arrr){
        for(int i=0;i<arrr.length;i++){
            System.out.println(arrr[i]+"  ");

        }
        System.out.println();
    }
    public static void mang2Chieu(int[][]arr2c){
        for (int i = 0; i <arr2c.length ; i++) {
            for (int j = 0; j <arr2c[0].length ; j++) {
                System.out.println(arr2c[i][j]);

            }
            System.out.println();

        }
    }
////______________________________________________________
public static void xuatDl(int[] Arr){
    for(int i=0;i<Arr.length;i++){
        if(Arr[i]%2==0){
            Arr[i]/=2;

        }else{
            Arr[i]=(Arr[i]+1)/2;
        }
        System.out.print(Arr[i]+"  ");

    }
    System.out.println();
}
    public static void main(String[] args) {
        int[] arr1, arr2, arr3;
        int n1 = 5, n2 = 4, n3 = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mang 1(5pcs): \n");
        arr1 = nhapMang(n1, scanner);
        System.out.print("Nhap mang 2(4pcs): \n");
        arr2 = nhapMang(n2, scanner);
        System.out.print("Nhap mang 3(8pcs): \n");
        arr3 = nhapMang(n3, scanner);
        xuatDl(arr1);xuatDl(arr2);xuatDl(arr3);

        int max = findMax(arr1);//tim max trong arr1
        System.out.println("Max: " + max);
        int max2 = findMax(arr2);
        System.out.println("Max2: " + max2);
        int max3 = findMax(arr3);
        System.out.println("Max3: " + max3);

        String words = "What a beautiful city!";
        String[]sword=tachTu(words);
        showArrRes(sword); //dung phuong thuc khong tra ve o tren de xuat du lieu
    }
    /*
    Mang 2 chieu
     */
//        public static int[][] nhapMang2chieu(int n,int m, Scanner scanner) {
//        //nhapMang(int n(gia tri truyen vao), Scanner scanner(bien su dung lai))
//        int[][] arr = new int[m][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        return arr; //tra gia tri tuong ung cua kieu phuong thuc(int)
//    }

}
