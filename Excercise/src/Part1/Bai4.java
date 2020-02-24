package Part1;
//Viết chương trình in ra Bảng cửu chương.
public class Bai4 {

    public static void main(String[] args) {
        String a = "BANG CUU CHUONG";
        System.out.printf("%90s \n",a);
        System.out.println("                                        ________________________________________________________________________________");

        for (int i =1;i<=10;i++){
            for (int j =0;j<=10;j++){
                System.out.printf("| %3d x %2d = %2d",i,j,(i*j));

            }
            System.out.println("|");
        }

        System.out.println("                        ______________________________________________________________________________________________________________");

    }
}
