package CitiBridgeProgram;
import java.util.Scanner;

public class SwapNumbersWithNoTempVariables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        System.out.println("Before swapping: a1 = " + a1 + ", a2 = " + a2);
        a1 = a1 + a2;
        a2 = a1 - a2;
        a1 = a1 - a2;
        System.out.println("After swapping: a1 = " + a1 + ", a2 = " + a2);
        scanner.close();
        
    }
}
