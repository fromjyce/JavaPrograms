import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        if (num%2==0) {
            System.out.println("\nEntered number is an even number");
        }
        else {
            System.out.println("\nEntered number is an odd number");
        }

    }
    
}
