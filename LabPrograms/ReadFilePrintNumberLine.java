/*Write a Java Program that reads a file and displays the contents of the file with a line number before each line*/

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

public class ReadFilePrintNumberLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the filename with extension: ");
        String filename = scan.nextLine().trim();
        File file = new File(filename);
        boolean exist = file.exists();
        long fileSize = file.length();
        try {
            System.out.println("File Name: " + filename);
            if (exist) {
                if (fileSize != 0) {
                    List<String> allLines = Files.readAllLines(Paths.get(filename));
                    for (int i = 0; i < allLines.size(); i++) {
                        System.out.println((i + 1) + " " + allLines.get(i));
                    }
                } else {
                    System.out.println("File is empty");
                }
            } else {
                System.out.println("File Does not Exist");
            }

        } catch (IOException ioException) {
            System.out.println("File not detected for " + file);
        } finally {
            scan.close();
        }

    }
}

