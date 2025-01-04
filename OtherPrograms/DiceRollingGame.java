import java.util.Random;
import java.util.Scanner;

public class DiceRollingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int totalSum = dice1 + dice2;
        
        System.out.println("Guess the total sum of two dice rolls (between 2 and 12):");
        
        boolean guessedCorrectly = false;
        for (int attempts = 0; attempts < 5; attempts++) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            int guess = scanner.nextInt();
            
            if (guess < 2 || guess > 12) {
                System.out.println("Invalid guess. Please enter a number between 2 and 12.");
                attempts--; 
                continue;
            }
            
            if (guess == totalSum) {
                System.out.println("Correct!");
                guessedCorrectly = true;
                break;
            } else if (guess < totalSum) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
        }
        
        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all attempts. The correct sum was: " + totalSum);
        }
        
        scanner.close();
    }
}
