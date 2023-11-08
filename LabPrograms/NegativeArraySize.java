/*Check whether the given array size is negative or not. If the array size is negative, then handle it by using try and catch block. */

import java.util.*;

public class NegativeArraySize {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
        int[] arr;
        System.out.print("Enter the Array Size: ");
        int size = scan.nextInt();
        scan.nextLine();
        arr = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            scan.close();
        }
    }

}
