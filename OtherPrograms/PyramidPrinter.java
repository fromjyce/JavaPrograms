import java.util.Scanner;

public class PyramidPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }

            System.out.println(); // Move to the next line
        }
        scanner.close();
    }
}
