package Bonus;

import java.math.BigInteger;
import java.util.Random;

public class MyBigInterger {
    public static void main(String[] args) {
        BigInteger myBigI = gbi(20);
        System.out.println(myBigI);

    }
    public static BigInteger gbi(int bit){
        Random random = new Random();
        BigInteger res= new BigInteger(bit,random);
        return res;
    }
}
