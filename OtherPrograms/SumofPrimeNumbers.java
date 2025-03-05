import java.util.Scanner;

class Main
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int upper = scan.nextInt();
        int lower = scan.nextInt();
        if (lower < 0 || upper < 0) {
            System.out.println("Invalid Inputs");
        } else {
            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            System.out.println(sum);
            scan.close();
        }
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } 
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
