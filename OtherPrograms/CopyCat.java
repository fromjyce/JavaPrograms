import java.util.HashMap;
import java.util.Scanner;

public class CopyCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter string 1:");
        String str1 = scan.nextLine();
        
        System.out.println("Enter string 2:");
        String str2 = scan.nextLine();
        
        if (haveSameFrequency(str1, str2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scan.close();
    }
    
    public static boolean haveSameFrequency(String str1, String str2) {
        HashMap<Character, Integer> freqMap1 = getCharacterFrequency(str1.toLowerCase());
        HashMap<Character, Integer> freqMap2 = getCharacterFrequency(str2.toLowerCase());
        
        return freqMap1.equals(freqMap2);
    }
    
    public static HashMap<Character, Integer> getCharacterFrequency(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        return freqMap;
    }
}
