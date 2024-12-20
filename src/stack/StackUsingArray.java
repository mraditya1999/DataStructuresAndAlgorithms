package stack;


import java.util.Scanner;

public class StackUsingArray {
    int top;
    int[] arr;
    int size;

    StackUsingArray(int size) {
        this.top = -1;
        this.arr = new int[size];
        this.size = size;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingArray stack = new StackUsingArray(10);
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
