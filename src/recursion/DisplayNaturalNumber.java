package recursion;

import java.util.Scanner;

public class DisplayNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        System.out.print("Ascending Order: ");
        displayInAscendingOrder(N);

        System.out.println();

        System.out.print("Descending Order: ");
        displayInDescendingOrder(N);
    }

    public static void displayInAscendingOrder(int N) {
        if (N == 0) return;
        displayInAscendingOrder(N - 1);
        System.out.print(N + " ");
    }

    public static void displayInDescendingOrder(int N) {
        if (N == 0) return;
        System.out.print(N + " ");
        displayInDescendingOrder(N - 1);
    }
}
