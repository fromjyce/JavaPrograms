//Multiply two number from reader's input
import java.util.Scanner;
public class MultiplyInt {
    public static void main(String[] args) {
        int num1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number A: ");
        num1 = scan.nextInt();
        scan.nextLine();
        int num2;
        System.out.print("Enter number B: ");
        num2 = scan.nextInt();
        System.out.print("Product: " + num1*num2);
        scan.close();

    }
    
}
