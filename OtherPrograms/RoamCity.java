import java.util.*;

public class RoamCity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < T; i++) {
            String[] numbers = scan.nextLine().split(" ");
            int n = Integer.parseInt(numbers[0]);
            String[] pathElements = scan.nextLine().split("");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(pathElements[j]);
            }

            int mod = mode(arr);
            System.out.println(mod);
        }

        scan.close();
    }

    public static int mode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxValue = arr[0];
        int maxCount = 0;
        for (int num : arr) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                maxValue = num;
            } else if (count == maxCount) {
                if (num > maxValue) {
                    maxValue = num;
                }
            }
        }

        return maxValue;
    }
}
