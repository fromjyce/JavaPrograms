import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaxiService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int Q = scanner.nextInt();
            int[] schedule = new int[N];
            Map<Integer, Integer> firstOccurrence = new HashMap<>();
            Map<Integer, Integer> lastOccurrence = new HashMap<>();
            
            for (int i = 0; i < N; i++) {
                schedule[i] = scanner.nextInt();
                if (!firstOccurrence.containsKey(schedule[i])) {
                    firstOccurrence.put(schedule[i], i);
                }
                lastOccurrence.put(schedule[i], i);
            }
            
            int result = 0;
            for (int i = 0; i < Q; i++) {
                int si = scanner.nextInt();
                int sj = scanner.nextInt();

                if (firstOccurrence.containsKey(si) && lastOccurrence.containsKey(sj) && firstOccurrence.get(si) <= lastOccurrence.get(sj)) {
                    result++;
                }
            }
            
            System.out.println(result);
        }
        
        scanner.close();
    }
}
