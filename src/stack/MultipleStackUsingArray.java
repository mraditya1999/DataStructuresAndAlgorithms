package stack;

import java.util.Scanner;

public class MultipleStackUsingArray {
    int top1;
    int top2;
    int[] arr;
    int size1;
    int size2;

    MultipleStackUsingArray(int size1, int size2) {
        this.size1 = size1;
        this.size2 = size2;
        arr = new int[size1 + size2];
        top1 = -1;
        top2 = size1 + size2; // start `top2` from the end of the array.
    }

    public void push(int value, int stackNumber) {
        switch (stackNumber) {
            case 1:
                if (isFull(stackNumber)) {
                    System.out.println("Stack Overflow");
                    return;
                }
                arr[++top1] = value;
                break;
            case 2:
                if (isFull(stackNumber)) {
                    System.out.println("Stack Overflow");
                    return;
                }
                arr[--top2] = value;
                break;
        }
    }

    public int pop(int stackNumber) {
        switch (stackNumber) {
            case 1:
                if (isEmpty(stackNumber)) {
                    System.out.println("Stack Underflow");
                    return -1;
                }
                return arr[top1--];
            case 2:
                if (isEmpty(stackNumber)) {
                    System.out.println("Stack Underflow");
                    return -1;
                }
                return arr[top2++];
            default:
                return -1;
        }
    }

    public int peek(int stackNumber) {
        switch (stackNumber) {
            case 1:
                if (isEmpty(stackNumber)) {
                    System.out.println("Stack Underflow");
                    return -1;
                }
                return arr[top1];
            case 2:
                if (isEmpty(stackNumber)) {
                    System.out.println("Stack Underflow");
                    return -1;
                }
                return arr[top2];
            default:
                return -1;
        }
    }

    public void display(int stackNumber) {
        switch (stackNumber) {
            case 1:
                if (isEmpty(stackNumber)) {
                    System.out.println("Stack Underflow");
                }
                for (int i = 0; i <= top1; i++) System.out.print(arr[i] + " ");
                break;
            case 2:
                if (isEmpty(stackNumber)) {
                    System.out.println("Stack Underflow");
                }
                for (int i = size1 + size2 - 1; i >= top2; i--) System.out.print(arr[i] + " ");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
    }

    public boolean isEmpty(int stackNumber) {
        if (stackNumber == 1) return top1 == -1;
        return top2 == size1 + size2;
    }

    public boolean isFull(int stackNumber) {
        if (stackNumber == 1) return top1 == size1 - 1;
        return top2 == size1;
    }

    public boolean availableStacks(int stackNumber) {
        return stackNumber == 1 || stackNumber == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultipleStackUsingArray stack = new MultipleStackUsingArray(5, 5);
        int choice;

        do {
            System.out.println();
            System.out.println("Enter your choice: ");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\n");
            choice = sc.nextInt();
            int stackNumber;

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    System.out.print("Enter stack Number (1 or 2): ");
                    stackNumber = sc.nextInt();
                    if (!stack.availableStacks(stackNumber)) {
                        System.out.println("Stack unavailable");
                        break;
                    }
                    stack.push(value, stackNumber);
                    break;
                case 2:
                    System.out.print("Enter stack Number (1 or 2): ");
                    stackNumber = sc.nextInt();
                    if (!stack.availableStacks(stackNumber)) {
                        System.out.println("Stack unavailable");
                        break;
                    }
                    System.out.println(stack.pop(stackNumber));
                    break;
                case 3:
                    System.out.print("Enter stack Number (1 or 2): ");
                    stackNumber = sc.nextInt();
                    if (!stack.availableStacks(stackNumber)) {
                        System.out.println("Stack unavailable");
                        break;
                    }
                    System.out.println(stack.peek(stackNumber));
                    break;
                case 4:
                    System.out.print("Enter stack Number (1 or 2): ");
                    stackNumber = sc.nextInt();
                    if (!stack.availableStacks(stackNumber)) {
                        System.out.println("Stack unavailable");
                        break;
                    }
                    stack.display(stackNumber);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
