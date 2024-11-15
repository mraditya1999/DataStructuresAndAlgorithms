package queue;

import java.util.Scanner;

public class LinearQueueUsingArray {
    int front;
    int rear;
    int[] arr;

    LinearQueueUsingArray(int size) {
        this.front = -1;
        this.rear = -1;
        arr = new int[size];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
            arr[rear] = data;
            return;
        }

        arr[++rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = arr[front];
        front++;
        if (front >= rear) front = rear = -1;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearQueueUsingArray queue = new LinearQueueUsingArray(10);
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
