package linked_list;

import java.util.Scanner;

public class AddTwoPolynomial {
    static PolynomialNode start1;
    static PolynomialNode start2;

    public static void createPolynomial(PolynomialNode start, int number, int coefficient) {
        PolynomialNode newNode = new PolynomialNode(number, coefficient);
        if (start == null) {
            if (start == start1) {
                start1 = newNode;
            } else {
                start2 = newNode;
            }
            return;
        }
        PolynomialNode curr = start;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public static void displayPolynomial(PolynomialNode start) {
        if (start == null) return;

        PolynomialNode curr = start;
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

    public static void multiplyScalar(PolynomialNode start, int scalar) {
        if (start == null) return;
        PolynomialNode curr = start;
        while (curr != null) {
            curr.number = curr.number * scalar;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Enter polynomial\t2. Display polynomial\t3. Multiply polynomial\t4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Number: ");
                    int number1 = sc.nextInt();
                    System.out.print("Enter its coefficient: ");
                    int coefficient1 = sc.nextInt();
                    createPolynomial(start1, number1, coefficient1);
                    break;

                case 2:
                    displayPolynomial(start1);
                    break;

                case 3:
                    System.out.print("Enter scalar to multiply: ");
                    int scalar = sc.nextInt();
                    multiplyScalar(start1, scalar);
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
