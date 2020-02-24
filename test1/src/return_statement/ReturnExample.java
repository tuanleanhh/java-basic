package return_statement;
/*
        Su dung return keyword
        1.Tra ve gia tri thuc hien boi mot phuong thuc khi no ket thuc
        2. ket thuc phuong thuc
        note: return phai la lenh duoc thuc thi cuoi cung
 */

public class ReturnExample {
//    public void sum(int a,int b){
////        int c = a+b;
////        if(c%2==0){
////            return;
////        }else {
////        System.out.println(c);
////        }
////    }
    public static int sum (int a,int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        ReturnExample returnExample = new ReturnExample();
        int sum = returnExample.sum(20,51);
        System.out.println(sum);
    }
}
