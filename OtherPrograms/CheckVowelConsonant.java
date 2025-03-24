import java.util.Scanner;
public class CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String word = scan.nextLine();
        if (word.length() == 1) {
            if (word.equals("A") || word.equals("a") || word.equals("E") || word.equals("e") || word.equals("I") || word.equals("i") || word.equals("O") || word.equals("o") || word.equals("U") || word.equals("u")) {
                    System.out.print("It is a vowel");
            }
            else {
                System.out.print("It is a consonant");
            }
        }
        else {
            System.out.print("Enter a single character");
        }
        scan.close();

    }
    
}
