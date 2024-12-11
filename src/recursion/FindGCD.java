package recursion;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("GCD: " + gcd);

        sc.close();
    }

    // Euclidean algorithm for finding the GCD
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) return num1;
        return findGCD(num2, num1 % num2);
    }
}
