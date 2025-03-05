package CitiBridgeProgram;
import java.util.Scanner;

class InvalidPhoneNumException extends Exception {
    public InvalidPhoneNumException(String m) {
        super(m);
    }
}

public class UserDefinedException {
    public static void validate(long number) throws InvalidPhoneNumException {
            if (String.valueOf(number).length() < 10) {
                throw new InvalidPhoneNumException("Phone Number must be of length of 10 or above.");
            }
            System.out.println("Valid number: " + number);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            long number = scan.nextLong();
            validate(number);
        } catch (InvalidPhoneNumException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
