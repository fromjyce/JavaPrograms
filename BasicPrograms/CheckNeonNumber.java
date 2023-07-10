import java.util.Scanner;
public class CheckNeonNumber {
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scan.nextInt();
    int numsquare = num*num;
    int sum = 0;
    while (numsquare > 0) {
        int m = numsquare % 10;
        sum = sum + m;
        numsquare = numsquare / 10;
    }
    if (sum==num) {
        System.out.println(num + " is a neon number");
    }
    else {
        System.out.println(num + " is not a neon number");
    }
}
}
