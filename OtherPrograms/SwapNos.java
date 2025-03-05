import java.util.Scanner;
public class SwapNos {
    public static void main(String[] args) {
        int a;
        int b;
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scan.nextInt();
        System.out.print("\nEnter the second number: ");
        b = scan.nextInt();
        System.out.println("\nFirst number is " + a);
        System.out.println("Second number is " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("\nFirst Number is : "+ a);
        System.out.println("Second Number is : " + b);
        scan.close();
    }
    
}
