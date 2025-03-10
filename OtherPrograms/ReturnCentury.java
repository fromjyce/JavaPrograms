/*Given a year, return the century it is in. 
The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.
Example
For year = 1905, the output should be
solution(year) = 20;
For year = 1700, the output should be
solution(year) = 17*/
import java.util.Scanner;
public class ReturnCentury {
    static int ReturnCentury(int year) {
        return (year-1)/100+1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scan.nextInt();
        System.out.printf("Century is %d", ReturnCentury(year));
        scan.close();
    }
}
