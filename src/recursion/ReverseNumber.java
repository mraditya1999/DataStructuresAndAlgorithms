package recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int ans = reverseNumber(N, 0);
        System.out.println("Reverse of " + N + " is " + ans);
    }

    public static int reverseNumber(int N, int sum) {
        if (N == 0) return sum;
        sum = sum * 10 + N % 10;
        return reverseNumber(N / 10, sum);
    }
}
