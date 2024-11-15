package stack;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    private Node head;
    Node top;

    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            top = newNode;
            return;
        }

        top.next = newNode;
        top = newNode;
    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        if (head.next == null) {
            int value = top.data;
            head = null;
            top = null;
            return value;
        }

        Node curr = head;
        Node prev = head;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        int value = top.data;
        top = prev;
        prev.next = null;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        return top.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingLinkedList stack = new StackUsingLinkedList();
        int choice;

        do {
            System.out.println();
            System.out.println("1. Push\t2. Pop\t3. Peek\t4. Display\t5. Exit\t");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element: ");
                    stack.push(sc.nextInt());
                    break;

                case 2:
                    System.out.println(stack.pop());
                    break;

                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                    stack.displayStack();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
