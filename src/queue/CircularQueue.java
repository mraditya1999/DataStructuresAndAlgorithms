package queue;

import java.util.Scanner;

public class CircularQueue {
    int front;
    int rear;
    int[] arr;
    int size;

    CircularQueue(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        arr = new int[size];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            arr[rear] = data;
        } else {
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = arr[front];
        if (front == rear) front = rear = -1;
        else {
            front = (front + 1) % size;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        if (rear < front) {
            for (int i = front; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (front == (rear + 1) % size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue queue = new CircularQueue(10);
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
