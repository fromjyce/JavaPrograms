import java.util.*;
import java.io.*;
import java.lang.*;
class PalindromeChecker {
    static String ReverseString(String word) {
        StringBuffer sbr = new StringBuffer(word);
        sbr.reverse();
        return sbr.toString();
    }
    static String CheckPalindrome(String word, String rev) {
        if (word.equals(rev)) {
            return "This is a Palindrome";
        }
        else {
            return "This is not a Palindrome";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        System.out.println(CheckPalindrome(word,ReverseString(word)));
        scan.close();
    }
}
