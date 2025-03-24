import java.util.Scanner;

public class FindMaxThree {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = scan.nextInt();
    System.out.print("Enter the second number: ");
    int b = scan.nextInt();
    System.out.print("Enter the third number: ");
    int c = scan.nextInt();
    if (a > b && a > c) {
        System.out.println("\n" + a + " is the greatest number");
    }
    else if (a<b && c<b) {
        System.out.println("\n" + b + " is the greatest number");
    }
    else {
        System.out.println("\n" + c + " is the greatest number");
    }
    scan.close();
    }

    
}
