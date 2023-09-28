/*Design a Java interface for ADT Stack. Implement this interface using array. 
Provide necessary exception handling in both the implementations. */

import java.util.*;

public class StackArray {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
        System.out.print("Enter the size of the stack: ");
        int size = scan.nextInt();
        Stack stack = new Stack(size);
        int choice = 0;
        while (choice!=6) {
            System.out.print("\nDo you want to \n1. PUSH \n2. PEEK \n3. POP \n4. SEARCH \n5. TRAVERSE \n6. EXIT \nEnter your choice: ");
            choice = scan.nextInt();
            if (choice==1) {
                System.out.print("Enter the element: ");
                int element = scan.nextInt();
                stack.push(element);
            }
            else if (choice==2) {
                stack.peek();
            }
            else if(choice==3) {
                System.out.println("Successfully popped the element");
                stack.pop();
            }

            else if (choice==4) {
                System.out.print("Enter the element that you want to search: ");
                int searchelem = scan.nextInt();
                stack.search(searchelem);
                
            }
            else if(choice==5) {
                System.out.print("Elements of the Stack: ");
                stack.print();
            }
            else if (choice==6) {
                break;
            }

        }

    } catch (InputMismatchException e) {
        System.out.println("Input error: Please enter a valid integer.");
    } finally {
        scan.close();
    }
        
    }
    

}

class Stack {

    private int size;
    private int[] arr;
    private int top = -1;
    
    Stack(int sizen) {
        this.size = sizen;
        this.arr = new int[size];
    }

    void push(int ele) {
        try {
            if (top >= (size - 1)) {
                throw new StackOverflowError("Stack Overflow");
            } else {
                ++top;
                arr[top] = ele;
            }
        } catch (StackOverflowError e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void pop() {
        
            if (top < 0) {
                throw new StackUnderflowException("Stack Underflow");
            } else {
                top--;
            }
    }

    void peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
        }
        else {
            int x = arr[top];
            System.out.println("Top Most Element: " + x);
        }
    }

    void print(){
    for(int i = top;i>-1;i--){
      System.out.print(" "+ arr[i]);
    }
}
boolean search(int searchElem) {
        for (int i = 0; i <= top; i++) {
            if (arr[i] == searchElem) {
                System.out.println("Element " + searchElem + " found at position " + i+1);
                return true;
            }
        }
        System.out.println("Element " + searchElem + " not found in the stack.");
        return false;
    }
}

class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super(message);
    }
}