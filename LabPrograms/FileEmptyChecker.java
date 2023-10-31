/*File Handling: Check if a File Exists and if It's Empty, Throw an IOException */

import java.io.File;
import java.io.IOException;

public class FileEmptyChecker {
    public static void main(String[] args) {
        File file = new File("yourfile.txt");
        
        if (file.exists()) {
            if (file.length() == 0) {
                System.out.println("File is empty.");
            } else {
                System.out.println("File exists and is not empty.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
