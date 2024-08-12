import java.util.Arrays;


public class MaxProfitSubset {
    public static long getMaxProfit(int[] indicators, int[] profit, int k) {
        int n = indicators.length;
        long[] dp = new long[1 << n];
        Arrays.fill(dp, -Long.MAX_VALUE);
        dp[0] = 0;
        
        for (int mask = 1; mask < (1 << n); mask++) {
            int currentOr = 0;
            long currentProfit = 0;
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    currentOr |= indicators[j];
                    currentProfit += profit[j];
                }
            }
            
            if (currentOr <= k) {
                dp[mask] = Math.max(dp[mask], currentProfit);
            }
        }
        
        long maxProfit = 0;
        for (int mask = 0; mask < (1 << n); mask++) {
            if (dp[mask] != -Long.MAX_VALUE) {
                maxProfit = Math.max(maxProfit, dp[mask]);
            }
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] indicators = {1,2,3,4};
        int[] profit = {4,3,2,1};
        int k = 1;
        
        System.out.println(getMaxProfit(indicators, profit, k));  // Output: 9
    }
}
