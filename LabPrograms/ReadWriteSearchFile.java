/*Read a file, remove spaces and put it in another file. Then get a search word input and implement two search techniques. Search from the start of the file or from the last of the last of the file*/

import java.io.*;
import java.util.Scanner;

public class ReadWriteSearchFile {
    public static void main(String[] args) {
        // Step 1: Read the input file, remove spaces, and write to another file
        try {
            String inputFileName = "input.txt";
            String outputFileName = "output.txt";

            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                // Remove spaces
                line = line.replaceAll(" ", "");

                // Write the modified line to the output file
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Spaces removed and saved to " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Search for a word in the file
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String searchWord = scanner.next();
        
        try {
            BufferedReader searchReader = new BufferedReader(new FileReader("output.txt"));
            String fileContent = "";
            String line;
            
            while ((line = searchReader.readLine()) != null) {
                fileContent += line;
            }
            
            // Search from the start of the file
            if (fileContent.contains(searchWord)) {
                System.out.println("Word found in the file (searching from the start).");
            } else {
                System.out.println("Word not found in the file (searching from the start).");
            }

            // Search from the end of the file
            if (fileContent.lastIndexOf(searchWord) >= 0) {
                System.out.println("Word found in the file (searching from the end).");
            } else {
                System.out.println("Word not found in the file (searching from the end).");
            }
            
            searchReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

