/*Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates. */

import java.util.*;

public class DuplicateNumberChecker{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Integer> Numbers = new ArrayList<Integer>();
        System.out.print("How many numbers you will add: ");
        int count = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < count; i ++) {
            System.out.print("Element " + (i+1) + ": ");
            int ele = scan.nextInt();
            scan.nextLine();
            Numbers.add(ele);
        }
        try {
                checkDuplicates(Numbers);
                
            } catch (DuplicateNumberWarning e) {
                System.err.println(e.getMessage());
            } finally {
                scan.close();
            }
    }

    public static void checkDuplicates(List<Integer> Numbers) throws DuplicateNumberWarning {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int number : Numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }
        if (!duplicates.isEmpty()) {
            throw new DuplicateNumberWarning("Duplicates Detected");
        }
    }
    
}

class DuplicateNumberWarning extends Exception {
    public DuplicateNumberWarning(String message) {
        super(message);
    }
}
