import java.util.Arrays;
import java.util.Scanner;

public class MaggiPackets {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int Q = scanner.nextInt();
            
            int[] boxes = new int[N];
            for (int i = 0; i < N; i++) {
                boxes[i] = scanner.nextInt();
            }

            Arrays.sort(boxes);

            int[] prefixSum = new int[N];
            prefixSum[0] = boxes[N-1];
            for (int i = 1; i < N; i++) {
                prefixSum[i] = prefixSum[i-1] + boxes[N-i-1];
            }

            while (Q-- > 0) {
                int x = scanner.nextInt();

                int result = findMinBoxes(prefixSum, x);
                
                System.out.println(result);
            }
        }
        
        scanner.close();
    }
    
    private static int findMinBoxes(int[] prefixSum, int x) {

        if (prefixSum[prefixSum.length - 1] < x) {
            return -1;
        }

        int left = 0;
        int right = prefixSum.length - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            
            if (prefixSum[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left + 1;
    }
}
