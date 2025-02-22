import java.util.Scanner;


public class ReverseStringPreserveSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input= scan.nextLine();
        System.out.println(reversePreserveSpaces(input));
    }

    public static String reversePreserveSpaces(String input) {
        char[] characters = input.toCharArray();
        int left = 0, right = characters.length - 1;
        while (left < right) {
            if (characters[left] == ' ') {
                left++;
                continue;
            }
            if (characters[right] == ' ') {
                right--;
                continue;
            }
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return new String(characters);
    }
}
