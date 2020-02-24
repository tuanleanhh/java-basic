package From29to35;
/*
        Mang mot chieu: la mot danh sach cua cac bien cung kieu
            khai bao khoi tao
            gia tri mac dinh cua tung mang
            lay so phan tu cua mang
            truy xuat thong tin cua mang
            **Chi so phan tu trong mang luon bat dau tu 0 toi length-1
 */

public class bai31Mangmotchieu {
    public static void main(String[] args) {
        int[] arr = new int[3]; // kieu[] ten mang
        //tang mang nguyen arr co kha nang luu tru 100 phan tu
//        arr[0] = 100;
//        arr[1] = 200;
//        arr[9] = 600;
//        int x = arr[1];
        int n = arr.length;// lay so phan tu cua mang
        //System.out.println(x);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");//arr[i]:truy xuat tong tin cua mang
            if (i % 20 == 0) {
                System.out.println();
            }
        }
        //int[] b = arr; // tao mang b co kha nang luu tru nhu arr
    }
}

