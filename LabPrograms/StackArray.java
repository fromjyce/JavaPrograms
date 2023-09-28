//Operations of Stack: Push, POP,Peek, Search, Size

import java.util.*;

public class StackArray {
    
    Stack <Integer> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);

    static void pushelement() {

    }

    static void popelement() {

    }

    static void peekelement() {

    }

    static void searchelement() {
        
    }

    public static void main(String[] args) {
        StackArray stkarr = new StackArray();
        System.out.print("Do you want to \n1. Push \n2. Pop \n3. Peek \n4. Search \n5. Exit \nEnter Your Choice: ");
        int choice = stkarr.scanner.nextInt();
        stkarr.scanner.nextLine();
        while (choice!=5){
            if (choice == 1) {
                pushelement();
            }

            else if (choice == 2) {
                popelement();
            }

            else if (choice == 3) {
                peekelement();
            }

            else if (choice == 4) {
                searchelement();
            }
        }
    }
    
}
