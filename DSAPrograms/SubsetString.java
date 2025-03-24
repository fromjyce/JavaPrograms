package DSAPrograms;

import java.util.Scanner;

public class SubsetString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter string a:");
        String a = scan.nextLine();
        
        System.out.println("Enter string b:");
        String b = scan.nextLine();
        
        if (b.contains(a)) {
            System.out.println("String b contains string a.");
        } else {
            System.out.println("String b does not contain string a.");
        }
        
        scan.close();
    }
}
