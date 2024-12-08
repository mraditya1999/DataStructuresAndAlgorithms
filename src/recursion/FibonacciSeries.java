package recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        sc.close();

        // Print the Nth Fibonacci term
        int nthTerm = findNthFibonacci(N);
        System.out.println("Nth Fibonacci term is: " + nthTerm);

        // Print the entire Fibonacci series up to N terms
        System.out.print("Fibonacci series up to N terms: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(findNthFibonacci(i) + " ");
        }
        System.out.println();

        // Print the sum of the entire Fibonacci series up to N terms
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += findNthFibonacci(i);
        }
        System.out.println("Sum of Fibonacci series up to N terms: " + sum);
    }

    public static int findNthFibonacci(int N) {
        if (N == 1 || N == 2) {
            return N - 1;
        }
        return findNthFibonacci(N - 1) + findNthFibonacci(N - 2);
    }
}
