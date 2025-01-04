import java.util.Scanner;

public class FactorialSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("Factorial of 0 is 1. Yes");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
            if (containsDigitOne(factorial)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }

    public static boolean containsDigitOne(long number) {
        while (number > 0) {
            if (number % 10 == 1) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
