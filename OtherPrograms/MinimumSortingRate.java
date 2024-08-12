import java.util.Scanner;

public class MinimumSortingRate {

    // Function to calculate total hours needed for a given rate k
    public static long calculateHours(int[] donations, int k) {
        long hours = 0;
        for (int donation : donations) {
            hours += (donation + k - 1) / k; // Equivalent to ceil(donation / k)
        }
        return hours;
    }

    // Binary search to find the minimum k
    public static int findMinimumRate(int n, int[] donations) {
        int left = 1; // Minimum possible rate
        int right = 0;
        for (int donation : donations) {
            right = Math.max(right, donation); // Maximum rate needed to handle the largest box
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            long hoursNeeded = calculateHours(donations, mid);

            if (hoursNeeded <= n) {
                right = mid; // Try a smaller rate
            } else {
                left = mid + 1; // Increase the rate
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of hours left
            int length = scanner.nextInt(); // Size of the donations array
            int[] donations = new int[length];

            for (int i = 0; i < length; i++) {
                donations[i] = scanner.nextInt(); // Clothing items in each box
            }

            int minRate = findMinimumRate(n, donations);
            System.out.println(minRate);
        }

        scanner.close();
    }
}
