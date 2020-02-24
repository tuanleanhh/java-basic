package From1to28;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.Paths.*;

public class b19docdulieutufile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths
                .get("D:\\TKLTW\\example.php"), "UTF-8");//mo file
        int inputInteg; //= scanner.nextInt();//doc du lieu tu ban phim //doc file tu file abc
        while (scanner.hasNextLine()) {
            String lineData = scanner.nextLine();
            System.out.println("Second line Data: " + lineData);
        }

        scanner.close();
    }
}
