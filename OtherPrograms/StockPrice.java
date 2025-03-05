import java.util.Scanner;

public class StockPrice {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {5, 1, 4, 6, 7, 8, 4 ,3, 7, 9};

        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }
}
