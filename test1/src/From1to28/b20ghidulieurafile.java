package From1to28;//ghi du lieu ra file

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class b20ghidulieurafile {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter("D:\\KQ","UTF-8");
        printWriter.append("Hello world\n");
        printWriter.append("Hello world\n");
        printWriter.append("Hello world\n");
        printWriter.close(); //luon dong file khi ket thuc chuong trinh

    }

}
