import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        scanner.close();
    }

    public static boolean canReachAmount(long N) {
        Set<Long> visited = new HashSet<>();
        return driver(N, visited);
    }

    private static boolean driver(long N, Set<Long> visited) {
        if (N == 1) {
            return true;
        }

        if (N < 1 || visited.contains(N)) {
            return false;
        }

        visited.add(N);

        if (N % 20 == 0 && driver(N / 20, visited)) {
            return true;
        }

        if ( N % 10 == 0 && driver(N / 10, visited)) {
            return true;
        }

        return false;
    }
}
