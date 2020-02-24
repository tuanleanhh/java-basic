package From29to35;

/*
        BigInterger>Long
        BigDecimal>Doubler: dung khi yeu cau do chinh xac cao
 */

import java.math.BigDecimal;

public class bai30BigIntergerBigDecimal {
    public static void main(String[] args) {
//        BigInteger a = new BigInteger("845446545131545645646545646545454564445");
//        BigInteger b = new BigInteger("845446545131545645646545646556564564445");
//        BigInteger sum = a.add(b);// a+b
//        BigInteger d = a.subtract(b);//a-b
//        BigInteger e = a.multiply(b);//a*b
//        BigInteger f = a.divide(b);//a/b
//        System.out.println(d);
        BigDecimal a = new BigDecimal("1.999999999999999999999999999999999999999999999999999999999999999999999999");
        BigDecimal b = new BigDecimal("0.0000000000000000000000000000000000000000000000000000000000000000000000000001");
        BigDecimal c = a.add(b);
        System.out.println(c);
    }
}
