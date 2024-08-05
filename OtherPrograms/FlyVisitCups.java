import java.util.Scanner;

public class FlyVisitCups {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (canVisitAllCups(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean canVisitAllCups(int n) {
        boolean[] visited = new boolean[n];
        int currentPosition = 0;
        
        for (int k = 1; k <= n; k++) {
            visited[currentPosition] = true;
            currentPosition = (currentPosition + k) % n;
        }
        
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }
}
