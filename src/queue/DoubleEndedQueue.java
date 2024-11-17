package queue;

import java.util.Scanner;

public class DoubleEndedQueue {
    int front;
    int rear;
    int[] arr;
    int size;

    public DoubleEndedQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

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

    public void insertAtLeft(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        arr[front] = value;
    }

    public void insertAtRight(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        arr[rear] = value;
    }

    public void removeFromLeft() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println("The removed element is: " + arr[front]);
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    public void removeFromRight() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("The removed element is: " + arr[rear]);
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
    }

    public void displayDequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleEndedQueue dequeue = new DoubleEndedQueue(10);
        int choice;

        do {
            System.out.println();
            System.out.println("1. Input restricted Dequeue\t2. Output restricted Dequeue\t3. Display\t4. Exit\t");
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
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
