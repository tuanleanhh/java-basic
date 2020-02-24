package From1to28;// toan tu logic va toan tu ba ngoi
/*
    toan tu logic : && | ! xet 2 ve phia ben trai va ben phai cua toan tu
    toan tu ba ngoi: expression ? x : y
 */


public class b10toantu{
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        //System.out.println((a>b)&&(a!=b));// de kq la true trong phep && thi ca ve trai va phai deu true
      //  System.out.println((a>b)|(a!=b));// de kq trong phep |(hoac) la true thi 1 trong 2 ve phai true
        //System.out.println(!(a>b)); // phep phu dinh (!)
        String res = "";
       res = (a<b)? "a<b":"a>=b"; // toan tu 3 ngoi se lay ket qua sau dau ? neu expression true, nguoi lai se lay kq sau dau :
        System.out.println(res);
    }



}
