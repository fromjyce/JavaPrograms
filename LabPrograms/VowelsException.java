/*enter a string and check if it has vowels if no throw exception */

public class VowelsException {
    public static void main(String[] args) {
        try {
            String input = "Bdx"; // Replace with your input string
            checkForVowels(input);
            System.out.println("The string contains vowels.");
        } catch (NoVowelsException e) {
            System.err.println("The string does not contain any vowels: " + e.getMessage());
        }
    }

    public static void checkForVowels(String input) throws NoVowelsException {
        if (!input.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("No vowels found in the input string.");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
