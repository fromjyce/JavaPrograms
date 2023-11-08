/*File Handling: Check if a File Exists and if It's Empty, Throw an IOException */

import java.io.File;


public class FileEmptyChecker {
    public static void main(String[] args) {
        File file = new File("yourfile.txt");
        
       try {
        EmptyChecker(file);
        System.out.println("File is not empty.");
       } catch (FileEmptyWarning e) {
        System.err.println("File is empty or does not exist.");
       }
    }

    public static void EmptyChecker (File Filename) throws FileEmptyWarning {
        if (Filename.exists()) {
            if (Filename.length() == 0 ) {
                throw new FileEmptyWarning("File is Empty");
            } 
        } else {
            throw new FileEmptyWarning("File does not exist");
        }

    }
}

class FileEmptyWarning extends Exception {

public FileEmptyWarning(String errorMessage) {
        super(errorMessage);
    }
}
