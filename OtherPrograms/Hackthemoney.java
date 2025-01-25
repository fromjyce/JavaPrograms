/*Initially 1 Ruppee in your account. YOu want exactly N Ruppees in your account. You wrote two hacks - First: Can Multiply the amount of money you own by 10. Second: Can multiply the amount by 20. These hacks can be used any number of tuime. Can you achieve the desired amount N using these hacks. */
import java.util.Scanner;

public class Hackthemoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        boolean canAchieve = canReachAmount(N);

        if (canAchieve) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean canReachAmount(long N) {
        if (N < 1) {
            return false;
        }

        while (N > 1) {
            if (N % 10 == 0) {
                N /= 10;
            } else if (N % 20 == 0) {
                N /= 20;
            } else {
                return false;
            }
        }

        return N == 1;
    }
}
