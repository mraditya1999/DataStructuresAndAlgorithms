package basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        int reversedNumber = reverseNumber(N);
        System.out.println("Reversed: " + reversedNumber);
    }

    public static int reverseNumber(int N) {
        int rev = 0;
        while (N != 0) {
            int rem = N % 10;
            rev = rev * 10 + rem;
            N = N / 10;
        }
        return rev;
    }
}
