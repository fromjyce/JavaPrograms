/*Stack ADT */

import java.util.Stack;

public class StackADT {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Stack after pop: " + stack);
    }
}
