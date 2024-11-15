package queue;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinearQueueUsingLinkedList {
    Node front = null;
    Node rear = null;

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node curr = front;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearQueueUsingLinkedList queue = new LinearQueueUsingLinkedList();
        int choice;

        do {
            System.out.println();
            System.out.println("1. Enqueue\t2. Dequeue\t3. Peek\t4. Display\t5. Exit\t");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    queue.enqueue(sc.nextInt());
                    break;

                case 2:
                    System.out.println(queue.dequeue());
                    break;

                case 3:
                    System.out.println(queue.peek());
                    break;
                case 4:
                    queue.displayQueue();
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

