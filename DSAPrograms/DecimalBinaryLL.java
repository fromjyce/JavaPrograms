package DSAPrograms;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

   
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    
    public int toDecimal() {
        Node temp = head;
        int decimal = 0;
        while (temp != null) {
            decimal = (decimal << 1) | temp.data;
            temp = temp.next;
        }
        return decimal;
    }
}

public class DecimalBinaryLL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter binary digits (0 or 1) to create the linked list. Enter a non-binary digit to stop:");

        while (true) {
            int digit = scan.nextInt();
            if (digit != 0 && digit != 1) {
                break;
            }
            list.append(digit);
        }

        int decimalValue = list.toDecimal();
        System.out.println("The decimal value of the binary number in the linked list is: " + decimalValue);

        scan.close();
    }
}
