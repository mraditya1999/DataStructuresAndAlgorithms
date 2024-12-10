package recursion;

import java.util.Scanner;

public class Exponent_Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int result = calculateExponent(base, exponent);
        System.out.println("Result: " + result);

        sc.close();
    }

    public static int calculateExponent(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * calculateExponent(base, exponent - 1);
    }
}
