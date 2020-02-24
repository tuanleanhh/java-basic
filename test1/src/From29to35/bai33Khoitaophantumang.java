package From29to35;
//Khoi tao phan tu cua mang

public class bai33Khoitaophantumang {
    public static void main(String[] args) {
        //int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //cach1
        int[] arr = new int[]{1,54545,54,5,5,45,4,5,4,545,45,4,5};//cach2
        int length=arr.length;
        int [] b = new int[20];//cach 3.

        for(int i = 0;i<b.length;i++){
            if(i%2==0){
                b[i]=1; //gan gt cac phan tu trong mang
            }else {
                b[i]=2; // gan gia tri cho cac ptu trong mang
            }

        }
        for (int i:b   //for reach
             ) {
            System.out.print(i+" ");

        }

    }
}
