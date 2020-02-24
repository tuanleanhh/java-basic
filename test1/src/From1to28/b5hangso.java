package From1to28;

// khai bao hang so: final ... ... ;
// khai bao o muc do class them static
//khai bao hang so o muc do class de dung trong nhieu phuong thuc khac nhau ko phai khai bao lai
public class b5hangso {
   public static final double PI = 3.14;
    public static final float G = 9.7f;
    public static void main(String[] args) {
        final double PI = 3.14;
        final float G = 9.7f;
        System.out.println(PI);
        showGValue();
        showPI();

    }
    public static void showGValue(){
        System.out.println(G);
    }
    public static void  showPI(){
        System.out.println(PI);
    }


}
