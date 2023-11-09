/*Java program that gets input from the user, checks if it exceeds 6 words, and either writes the input to a file or prints a message if the limit is exceeded */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInputChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        String[] words = userInput.split("\\s+"); // Split input into words by space

        if (words.length <= 6) {
            // Write to a file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
                writer.write(userInput);
                System.out.println("Input written to 'output.txt'.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The input exceeds 6 words.");
        }
        scanner.close();
    }
}
