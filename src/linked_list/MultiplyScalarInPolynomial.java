package linked_list;

import java.util.Scanner;

public class MultiplyScalarInPolynomial {
    static PolynomialNode head;

    public static void createPolynomial(int number, int coefficient) {
        PolynomialNode newNode = new PolynomialNode(number, coefficient);
        if (head == null) {
            head = newNode;
            return;
        }
        PolynomialNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public static void displayPolynomial() {
        if (head == null) return;

        PolynomialNode curr = head;
        boolean isFirst = true;

        while (curr != null) {
            if (isFirst) {
                System.out.print(curr.number + "x^" + curr.coefficient);
                isFirst = false;
            } else {
                System.out.print((curr.number >= 0 ? "+" : "") + curr.number + "x^" + curr.coefficient);
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void multiplyScalar(int scalar) {
        if (head == null) return;
        PolynomialNode curr = head;
        while (curr != null) {
            curr.number = curr.number * scalar;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Enter polynomial\t2. Display polynomial\t3. Multiply Scalar\t4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Number: ");
                    int number1 = sc.nextInt();
                    System.out.print("Enter its coefficient: ");
                    int coefficient1 = sc.nextInt();
                    createPolynomial(number1, coefficient1);
                    break;

                case 2:
                    displayPolynomial();
                    break;

                case 3:
                    System.out.print("Enter scalar to multiply: ");
                    int scalar = sc.nextInt();
                    multiplyScalar(scalar);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!!");
            }
        } while (choice != 4);
    }
}
