import java.util.Scanner;

public class PrintPrimeInterval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the interval: ");
        int interval = scan.nextInt();
        
        for (int i = 2; i <= interval; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
