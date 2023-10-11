/*Write a Java program that reads a file name from the user, displays information about whether the file exists, whether the file is readable, or writable, the type of file and the length of the file in bytes.  */

import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class FileOperations {

    Scanner scan = new Scanner(System.in);
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the filename with extension: ");
        String filename = scan.nextLine().trim();
        File file = new File(filename);
        boolean exist = file.exists();
        boolean canRead = file.canRead();
        boolean canWrite = file.canWrite();
        long fileSize = file.length();
        String filePath = file.getAbsoluteFile().toString();
        String fileType = "Undetermined";
        try {
            fileType = Files.probeContentType(file.toPath());
            System.out.println("File Name: " + filename);
            if (exist) {
                System.out.println("File Exists");
                System.out.println("File Size: " + fileSize);
                System.out.println("File path: " + filePath);
                System.out.println("File Type: " + fileType);
            } else {
                System.out.println("File Does not Exist");
            }
            if (canRead) {
                System.out.println("File is READABLE");
            } else {
                System.out.println("File is NOT READABLE");
            }
            if (canWrite) {
                System.out.println("File is WRITEABLE");
            } else {
                System.out.println("File is NOT WRITEABLE");
            }

        } catch (IOException ioException) {
            System.out.println("File not detected for " + file);
        } finally {
            scan.close();
        }
        
    }
}
