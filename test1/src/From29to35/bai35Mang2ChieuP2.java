package From29to35;


/*
        Su dung for each vs mang 2 chieu:chi dung de truy xuaat ptu. k dug de gan
        Mang zigzag:la mang co so phan tu o cac hang khac nhau
 */

public class bai35Mang2ChieuP2 {
    public static void main(String[] args) {
        // For reach
        int[][] arr = new int[4][3];
        //chi so truy cap ptu mang: 0->length-1
        arr[0][0] = 500;
        arr[0][1] = 300;
        arr[arr.length - 1][arr[0].length - 1] = 999;
        for (int[] x : arr) { //truy xuat tung hang
            for (int y : x) { //truy xuat tung cot
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("_____________________________");
        //Mang zigzag
        int[][] arr2 = new int[10][];
        //xac dinh so cot
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new int[i + 1]; //gan so cot-> dc mang zigzag
            //gan ptu vao mang
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i + j;

            }
        }
        System.out.println("                Mang ZigZag");
        // xuat phan tu
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "    ");

            }
            System.out.println();

        }


    }
}
