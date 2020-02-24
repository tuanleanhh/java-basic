package From1to28;
// lenh dieu khien vong lap
// for(;;) :vong lap vo han
// break chi co tac dung o vong lap gan no nhat
// khi dieu kien duoc thoa man thi cau lenh phia sau continue se ko ddc thuc hien

public class b28lenhbreakContinue {
    public static void main(String[] args) {
//        int count = 0;
//        int i = 99;
//        for(int j=0;j<10;j++){
//            count   = 0;
//            for (; ; ) {
//                if (i % 5 == 0) {
//                    System.out.println(i);
//                    count++;
//                }
//
//                if (count == 5) {
//                    System.out.println("break tai vong lap j ="+j);
//                    break;
//                }
//                i++;
//            }
//                if (j==3){
//                    break;
//                }
//        }

        for (int i =0;i<100;i++){
            if (i %5==0||i%2==0) {
                continue; // khong in ra cac so chia het cho 2 va 5
            }
            System.out.println(i);
        }
    }
}
