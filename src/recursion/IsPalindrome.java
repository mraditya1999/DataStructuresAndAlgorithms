package recursion;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        boolean isPalindrome = isPalindrome(N);
        System.out.println("Is Palindrome: " + isPalindrome);

        sc.close();
    }

    public static int reverseNumber(int N, int ans) {
        if (N == 0) return ans;
        ans = ans * 10 + N % 10;
        return reverseNumber(N / 10, ans);
    }

    public static boolean isPalindrome(int N) {
        int reversedNumber = reverseNumber(N, 0);
        return reversedNumber == N;
    }
}
