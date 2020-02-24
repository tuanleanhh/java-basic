package From1to28;//gioi thieu string
/*
        -khai niem string
        -chuoi con
        -noi chuoi
 */


public class b13gioithieujavastring {

    public static void main(String[] args) {
       String myName = "LeTuan";
        // or String name =  new String("Tuan");
      //  String firstName = myName.substring(0,2); // lay den gia tri n-1
      //  String lastName = myName.substring(2);
      //  int length = myName.length(); //lay do dai cua xau myName
        //System.out.println("Length: "+length);
        //System.out.println("First Name: "+firstName);
       // System.out.println("Last Name: "+lastName);
        String firstString = "Hello ";
        String secondString = "World";
        String noiString = firstString+secondString+myName; // noi string
        System.out.println(noiString);
    }
}
