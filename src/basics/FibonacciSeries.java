package basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Nth term: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        printFibonacciSeries(N);
    }

    static void printFibonacciSeries(int N) {
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= N; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}
