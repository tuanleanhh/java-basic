package From29to35;

import java.util.Random;

/*
      Gioi thieu Random
 */
public class bai29Random {
    public static void main(String[] args) {
        //Random random = new Random();
        //int x = random.nextInt(100);
        for (int i = 0; i < 20; i++) {
            int x = new Random().nextInt(71) + 10;//ngau nhien trong doan 10-80
            System.out.println("X = " + x);
        }

    }
}
