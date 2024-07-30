/*You are given a string that contains a name hidden in it. Find the hidden name and try to find the Lucky Number for it. 
 Input Format: The Input contains a single string with a maximum of 32 characters in it.
 Output Format: The output contains a single integer representing the lucky number for the name decoded from the input.
 Explanation: Find the Alpha characters and find teh sum of alphabetical values. The lucky number is teh digital sum reduced up to a single digit
 */

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toUpperCase();
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                int value = input.charAt(i) - 'A' + 1;
                sum += value;
            }
        }
        while (sum > 9) {
            int t = 0;
            while (sum > 0) {
                t += sum % 10;
                sum /= 10;
            }
            sum = t;
        }
        System.out.println(sum);
    }
    
}

