package basics;

import java.util.Scanner;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check palindrome: ");
        int N = sc.nextInt();

        boolean isPalindromeNumber = isPalindromeNumber(N);
        System.out.println("Is " + N + " Palindrome number: " + isPalindromeNumber);
    }

    static boolean isPalindromeNumber(int N){
        int reversedNumber = BasicOperations.reverseNumber(N);
        return N == reversedNumber;
    }
}
