import java.util.Scanner;

public class PrimePairDifference {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int lower = scan.nextInt();
            int higher = scan.nextInt();
            int count = getPrimePairs(lower, higher);
            System.out.println(count);
            
    }

    public static int getPrimePairs(int lower, int higher) {
        int count = 0;
        for (int i = lower; i <= higher; i++){
            if (isPrime(i) && isPrime(i + 6)) {
                count += 1;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
    
}
