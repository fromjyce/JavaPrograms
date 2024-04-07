import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.123.189.148", 12345);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        // first file - original
        File file1 = new File("jyce.txt");
        FileInputStream fis1 = new FileInputStream(file1);
        byte[] buffer1 = new byte[4096];
        int bytesRead1;
        while ((bytesRead1 = fis1.read(buffer1)) != -1) {
            dos.write(buffer1, 0, bytesRead1);
        }
        fis1.close();
        
        // second file - hash
        /*File file2 = new File("hash.txt");
        FileInputStream fis2 = new FileInputStream(file2);
        byte[] buffer2 = new byte[4096];
        int bytesRead2;
        while ((bytesRead2 = fis2.read(buffer2)) != -1) {
            dos.write(buffer2, 0, bytesRead2);
        }
        fis2.close();*/

        dos.close();
        os.close();
        socket.close();
    }
}
