package basics;

import java.util.Scanner;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        boolean isPalindrome = isPalindrome(N);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(int N) {
        int temp = N;
        int reversed = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp = temp / 10;
        }

        return reversed == N;
    }
}
