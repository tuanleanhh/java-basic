package Example1;

public class abc {
    public static void main(String[] args) {
        boolean[] a = {true, true, true, true, false};

        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            System.out.println(i++);
                if (a[i] == check) {
                    break;
                }

            }
        }
}
