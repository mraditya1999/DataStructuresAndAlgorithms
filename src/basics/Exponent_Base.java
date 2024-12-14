package basics;

import java.util.Scanner;

public class Exponent_Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Exponent: ");
        int exponent = sc.nextInt();
        System.out.print("Enter Base: ");
        int base = sc.nextInt();

        int ans = calculatePower(exponent, base);
        System.out.println("Result: " + ans);
    }

    public static int calculatePower(int exponent, int base) {
        int ans = 1;
        for (int i = 1; i <= base; i++) {
            ans = ans * exponent;
        }
        return ans;
    }
}
