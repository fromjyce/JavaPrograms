import java.util.Arrays;
import java.util.Scanner;

public class GroupPhoto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();  
        
        while (t-- > 0) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int[] heights = new int[2 * N];
            
            for (int i = 0; i < 2 * N; i++) {
                heights[i] = scanner.nextInt();
            }

            Arrays.sort(heights);

            boolean possible = true;
            for (int j = 0; j < N; j++) {
                if (heights[j + N] - heights[j] < X) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
