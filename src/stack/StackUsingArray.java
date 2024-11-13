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
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingArray stack = new StackUsingArray(10);
        int choice;

        do {
            System.out.println();
            System.out.println("Enter your choice: ");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\n");
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
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
