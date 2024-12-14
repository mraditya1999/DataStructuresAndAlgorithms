package basics;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        boolean isPrime1 = isPrimeMethod1(N);
        boolean isPrime2 = isPrimeMethod2(N);

        System.out.println("Is Prime: " + isPrime1);
        System.out.println("Is Prime: " + isPrime2);
    }

    public static boolean isPrimeMethod1(int N) {
        if (N <= 1) return false;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeMethod2(int N) {
        if (N == 1) return false;

        for (int i = 2; i < N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }
}
