/**There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full.
Write a code to implement above scenario. Display JAR at counter with available number of candies. Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.

Output should give number of Candies sold and updated number of Candies in JAR.

If Input is more than candies in JAR, return: “INVALID INPUT”**/

import java.util.Scanner;

public class JARProblem {
    private int capacity;
    private int candies;
    private int refillThreshold;

    public JARProblem(int capacity, int refillThreshold) {
        this.capacity = capacity;
        this.refillThreshold = refillThreshold;
        this.candies = capacity;
    }

    public void displayJar() {
        System.out.println("Candies in JAR: " + candies);
    }

    public void serveCandies(int numCandies) {
        if (numCandies > candies) {
            System.out.println("INVALID INPUT");
        } else {
            candies -= numCandies;
            System.out.println("Candies sold: " + numCandies);
            if (candies <= refillThreshold) {
                refillJar();
            }
            displayJar();
        }
    }

    private void refillJar() {
        candies = capacity;
        System.out.println("JAR refilled!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JARProblem jar = new JARProblem(10, 3);
        scanner.close();

        while (true) {
            jar.displayJar();
            System.out.print("Enter number of candies to buy: ");
            int numCandies = scanner.nextInt();
            jar.serveCandies(numCandies);
        }
    }

}
