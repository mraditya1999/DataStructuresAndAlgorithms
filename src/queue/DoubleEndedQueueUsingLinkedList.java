package queue;

import java.util.Scanner;

public class DoubleEndedQueueUsingLinkedList {
    Node front;
    Node rear;

    public void inputRestrictedDequeue() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("1. Insert At Right\t2. Remove From Left\t3. Remove From Right\t4. Display\t5. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    insertAtRight(sc.nextInt());
                    break;

                case 2:
                    removeFromLeft();
                    break;

                case 3:
                    removeFromRight();
                    break;

                case 4:
                    displayDequeue();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    public void outputRestrictedDequeue() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("1. Insert At Left\t2. Insert At Right\t3. Remove From Left\t4. Display\t5. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    insertAtLeft(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter element: ");
                    insertAtRight(sc.nextInt());
                    break;

                case 3:
                    removeFromLeft();
                    break;

                case 4:
                    displayDequeue();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    public void doubleEndedQueue() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("1. Insert At Left\t2. Insert At Right\t3. Remove From Left\t4. Remove From Right\t5. Display\t6. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    insertAtLeft(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter element: ");
                    insertAtRight(sc.nextInt());
                    break;

                case 3:
                    removeFromLeft();
                    break;

                case 4:
                    removeFromRight();
                    break;

                case 5:
                    displayDequeue();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }

    public void insertAtLeft(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            return;
        }
        newNode.next = front;
        front = newNode;
    }

    public void insertAtRight(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void removeFromLeft() {
        if (front == null) {
            System.out.println("Queue is Empty!!");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        front = front.next;
    }

    public void removeFromRight() {
        if (front == null) {
            System.out.println("Queue is Empty!!");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        Node curr = front;
        Node prev = front;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        rear = prev;
    }

    public void displayDequeue() {
        if (front == null) {
            System.out.println("List is Empty!!");
            return;
        }

        Node curr = front;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleEndedQueueUsingLinkedList dequeue = new DoubleEndedQueueUsingLinkedList();
        int choice;

        do {
            System.out.println();
            System.out.println("1. Input restricted Dequeue\t2. Output restricted Dequeue\t3.Dequeue\t4. Display\t5. Exit\t");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    dequeue.inputRestrictedDequeue();
                    break;

                case 2:
                    dequeue.outputRestrictedDequeue();
                    break;

                case 3:
                    dequeue.doubleEndedQueue();
                    break;
                    
                case 4:
                    dequeue.displayDequeue();
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
