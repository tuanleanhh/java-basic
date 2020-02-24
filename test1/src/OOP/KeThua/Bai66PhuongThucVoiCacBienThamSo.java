package OOP.KeThua;
/*
    Phuong thuc voi cac bien tham so
 */

public class Bai66PhuongThucVoiCacBienThamSo {
    public static void main(String[] args) {
//        System.out.printf("%d",120);
//        System.out.printf("%s,%f,%d","Hello",120.65f,36);
        //System.out.printf("%d\n",new Object[]{120});
//        int max = findMax(1,5,6,3,7,8,5,77,589,520,563,456,896);
//        System.out.println(max);
//
//        int[] arr = {2,8,6,3,5,88,335,45,632};
//        max = findMax(arr);
//        System.out.println(max);
        System.out.println(maxString("Lee","Tuan","ABC","XYZ","dSASA"));

    }

    public static int findMax(int ... args){
        int max = Integer.MIN_VALUE;
        for (int x:args
             ) { if(x>max){
                 max = x;
        }
        }
        return max;
    }
    public static String maxString(String ... strings){  // String ... strings = String[] strings
        int len=0;
        int index= 0;
        for (int i = 0; i < strings.length; i++) {
            int l = strings[i].length();
            if(l>len){
                index = i;
            }

        }
        return strings[index];
    }
}
