import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BookstoreWorkers {

    // Function to calculate the length of LIS
    public static int lengthOfLIS(int[] arr) {
        ArrayList<Integer> lis = new ArrayList<>();
        for (int num : arr) {
            int pos = Collections.binarySearch(lis, num);
            if (pos < 0) {
                pos = -pos - 1;
            }
            if (pos == lis.size()) {
                lis.add(num);
            } else {
                lis.set(pos, num);
            }
        }
        return lis.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of books
            int[] bookShipments = new int[n];

            for (int j = 0; j < n; j++) {
                bookShipments[j] = scanner.nextInt(); // Popularity rankings of the books
            }

            int maxWorkers = lengthOfLIS(bookShipments);
            System.out.println(maxWorkers);
        }

        scanner.close();
    }
}
