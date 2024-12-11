package basics;

import java.util.Scanner;

public class FindGCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd1 = findGCDMethod1(num1, num2);
        int gcd2 = findGCDMethod2(num1, num2);
        int lcm = findLCM(num1, num2, gcd1);

        System.out.println("GCD: " + gcd1);
        System.out.println("GCD: " + gcd2);
        System.out.println("LCM: " + lcm);

        sc.close();
    }

    public static int findGCDMethod1(int num1, int num2) {
        int ans = 1;
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return ans;
    }

    public static int findGCDMethod2(int num1, int num2) {
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num2;
    }

    public static int findLCM(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd;
    }
}
