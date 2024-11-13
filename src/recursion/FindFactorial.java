package recursion;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int ans = findFactorial(N);
        System.out.println("Factorial of " + N + " is " + ans);
    }

    public static int findFactorial(int N) {
        if (N == 1) return N;
        return N * findFactorial(N - 1);
    }
}
