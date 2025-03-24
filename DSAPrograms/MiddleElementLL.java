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
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void findMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("The middle element is: " + slow.data);
    }
}

public class MiddleElementLL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter numbers to add to the linked list (type -1 to end):");
        while (true) {
            int data = scan.nextInt();
            if (data == -1) break;
            list.append(data);
        }

        System.out.println("The linked list is:");
        list.display();

        list.findMiddle();

        scan.close();
    }
}
