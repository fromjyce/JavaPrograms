package CitiBridgeProgram;
import java.util.Scanner;

public class CountDigitsInteger {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int length = String.valueOf(num).length();
    System.out.println("Number of digits in the integer is: " + length);
}
}