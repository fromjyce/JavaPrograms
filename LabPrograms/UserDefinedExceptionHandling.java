import java.util.*;

public class UserDefinedExceptionHandling {

    static void validate(int age) throws InValidAgeError {
        if (age <= 18) {
            throw new InValidAgeError("Age is NOT VALID");
        }
        else {
            System.out.println("Congrats!!!You have been validated");
        }
    }
    public static void main(String[] args) {
        try {
        Scanner scan = new Scanner(System.in);
        System.out.print("You have to be more than 18 years old\nEnter Your Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        validate(age);
        scan.close();
        } catch (InValidAgeError ex) {
            System.out.println("Exception Occured: " + ex);
        }
        
}
}

class InValidAgeError extends Exception {
    public InValidAgeError(String errorMessage) {
        super(errorMessage);
    }
}
