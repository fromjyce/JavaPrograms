package CitiBridgeProgram;
import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int daysLeft = remainingDays % 30;
        System.out.println("Years: " + years + ", Months: " + months + ", Days: " + daysLeft);
        scan.close();
    }   
}
