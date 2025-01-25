import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lower = scan.nextInt();
        int higher = scan.nextInt();
        int count = 0;
        for (int i=lower; i<=higher; i++) {
            String num = String.valueOf(i);
            if (driver(num)) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("No Unique Digits");
        } else {
            System.out.println(count);
        }
    }

    public static boolean driver(String number) {
            Map<Character, Integer> digitCountMap = new HashMap<>();
            for (char digit : number.toCharArray()) {
                if (Character.isDigit(digit)) {
                    digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
                }
            }
            for (int count : digitCountMap.values()) {
                if (count != 1) {
                    return false;
                }
            }
    
            return true;
        }    
}
