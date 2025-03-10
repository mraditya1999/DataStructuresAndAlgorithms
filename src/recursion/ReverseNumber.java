package recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int ans = getReversedNumber(N,0);
        System.out.println("Reverse of " + N + " is: " + ans);
    }


    static int getReversedNumber(int N, int reversed) {
        if (N == 0) {
            return reversed;
        }
        int lastDigit = N % 10;
        reversed = reversed * 10 + lastDigit;
        return getReversedNumber(N / 10, reversed);
    }
}
