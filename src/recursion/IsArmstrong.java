package recursion;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        boolean isArmstrong = isArmstrong(N);
        System.out.println("Is Armstrong: " + isArmstrong);

        sc.close();
    }

    public static boolean isArmstrong(int N) {
        int totalNoOfDigits = countDigits(N);
        int ans = sumOfDigits(N, totalNoOfDigits);
        return N == ans;
    }

    public static int sumOfDigits(int N, int totalNoOfDigits) {
        if (N == 0) return 0;
        return calculateExponent(N % 10, totalNoOfDigits) + sumOfDigits(N / 10, totalNoOfDigits);
    }

    public static int countDigits(int N) {
        if (N == 0) return 1;
        return 1 + countDigits(N / 10);
    }

    public static int calculateExponent(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * calculateExponent(base, exponent - 1);
    }
}
