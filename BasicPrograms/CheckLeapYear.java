import java.util.Scanner;
public class CheckLeapYear {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        if (year%4==0) {
            System.out.println("\n" + year + " is a leap year");
        }
        else {
            System.out.println("\n" + year + " is not a leap year");
        }

    }
    
}
