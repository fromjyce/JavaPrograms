import java.util.Scanner;

public class StockMarketProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            
            int[] priceChange = new int[n];
            for (int i = 0; i < n; i++) {
                priceChange[i] = scanner.nextInt();
            }
            int maxProfit = kadaneAlgorithm(priceChange);
            System.out.println(maxProfit * x);
        }
        
        scanner.close();
    }
    private static int kadaneAlgorithm(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
}
