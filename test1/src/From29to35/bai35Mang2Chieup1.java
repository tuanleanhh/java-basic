package From29to35;
/*
    Mang 2 chieu trong Java:
        1.Dinh nghia: tuong tu nhu bang tinh excel
        2. Truy xuat phan tu mang
        3. Su dung for each voi mang 2 chieu
        4. Mang zigzag
 */

public class bai35Mang2Chieup1 {
    public static void main(String[] args) {
        //tong quat: kieu[][] ten mang;
        int[][] arr = new int[4][3];
        //chi so truy cap ptu mang: 0->length-1
        arr[0][0] = 500;
        arr[0][1] = 300;
        arr[arr.length - 1][arr[0].length - 1] = 999;

        boolean[][] booleans = new boolean[5][6];

        String[][] strings = new String[8][9];

        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 9},
                {2, 5, 7, 8}

        };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = i * j; //gan ptu

            }

        }
        //xuat ptu cua mang
        for (int i = 0; i < arr2.length; i++) { //arr.length lay so ahng
            for (int j = 0; j < arr2[0].length; j++) {//arr[0].length lay so cot
                System.out.print(arr2[i][j] + "      ");
            }
            System.out.println();
        }

    }
}
