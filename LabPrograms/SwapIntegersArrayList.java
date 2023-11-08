/*java program to swap two integers in a array list */

import java.util.ArrayList;
import java.util.Collections;

public class SwapIntegersArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add some integers to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        System.out.println("Original ArrayList: " + numbers);
        
        int index1 = 1;  // Index of the first integer to swap
        int index2 = 3;  // Index of the second integer to swap
        
        if (index1 >= 0 && index1 < numbers.size() && index2 >= 0 && index2 < numbers.size()) {
            // Swap the integers
            Collections.swap(numbers, index1, index2);
            System.out.println("ArrayList after swapping: " + numbers);
        } else {
            System.out.println("Invalid index. Indices should be within the range of the ArrayList.");
        }
    }
}
