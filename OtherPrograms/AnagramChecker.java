// import java.util.Arrays;
// import java.util.Scanner;

// public class AnagramChecker {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String str1 = scanner.nextLine();
//         String str2 = scanner.nextLine();
//         if (areAnagrams(str1, str2)) {
//             System.out.println("Anagrams.");
//         } else {
//             System.out.println("Not Anagrams.");
//         }
//     }

//     public static boolean areAnagrams(String str1, String str2) {
//         str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
//         str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
//         if (str1.length() != str2.length()) {
//             return false;
//         }
//         char[] charArray1 = str1.toCharArray();
//         char[] charArray2 = str2.toCharArray();
//         Arrays.sort(charArray1);
//         Arrays.sort(charArray2);
//         return Arrays.equals(charArray1, charArray2);
//     }
// }

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (areAnagrams(str1, str2)) {
            System.out.println("Anagrams.");
        } else {
            System.out.println("Not Anagrams.");
        }
        scanner.close();
    }
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }
        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
