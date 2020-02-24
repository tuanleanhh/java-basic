package From1to28;

/*
- 8 kieu nguyen thuy
- 4 kieu nguyen: int long short byte
- 2 kieu thuc: float double
- 1 kieu char
- 1 kieu boolean
- kieu nguoi dung tu dinh nghia

 */
public class kieudulieu {
    public static void main(String[] args) {
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s",
                Integer.TYPE,Integer.BYTES,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Short.TYPE,Short.BYTES,Short.MIN_VALUE,Short.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Long.TYPE,Long.BYTES,Long.MIN_VALUE,Long.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Byte.TYPE,Byte.BYTES,Byte.MIN_VALUE,Byte.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Float.TYPE,Float.BYTES,Float.MIN_VALUE,Float.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Double.TYPE,Double.BYTES,Double.MIN_VALUE,Double.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Character.TYPE,Character.BYTES,Character.MIN_VALUE,Character.MAX_VALUE);
        boolean isNumber;//true or false
    }
}
