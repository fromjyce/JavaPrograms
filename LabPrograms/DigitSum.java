/*Get a 5-Digit Number as Input and Calculate the Sum of Digits in Odd and Even Places */

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        int digit;
        
        for (int i = 1; i <= 5; i++) {
            digit = number % 10;
            if (i % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            number /= 10;
        }

        System.out.println("Sum of digits in even places: " + sumEven);
        System.out.println("Sum of digits in odd places: " + sumOdd);
        scanner.close();
    }
}
