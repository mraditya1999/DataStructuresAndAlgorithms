package basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms to print: ");
        int numberOfTerms = sc.nextInt();

        printFibonacciSeries(numberOfTerms);
    }

    public static void printFibonacciSeries(int numberOfTerms) {
        int firstTerm = 0;
        int secondTerm = 1;

        if (numberOfTerms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        if (numberOfTerms >= 1) {
            System.out.print(firstTerm + " ");
        }

        if (numberOfTerms >= 2) {
            System.out.print(secondTerm + " ");
        }

        for (int i = 3; i <= numberOfTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }
}
