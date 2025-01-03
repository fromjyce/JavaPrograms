import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isPerfectPassword(password)) {
            System.out.println("Perfect Password");
        } else {
            System.out.println("Not a Perfect Password");
        }

        scanner.close();
    }

    public static boolean isPerfectPassword(String password) {
        if (password.length() != 9) {
            return false;
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        return hasLower && hasUpper && hasNumber && hasSpecial;
    }
}