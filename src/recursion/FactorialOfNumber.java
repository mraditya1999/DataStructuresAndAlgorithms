package recursion;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int ans = getFactorialOfNumber(N);
        System.out.println("Factorial of " + N + " is: " + ans);
    }

    static int getFactorialOfNumber(int N){
        if(N == 1) return N;
        return N * getFactorialOfNumber(N - 1);
    }
}
