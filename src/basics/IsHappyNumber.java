package basics;

import java.util.Scanner;

public class IsHappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        boolean isHappy = isHappy(N);
        System.out.println("Is Happy: " + isHappy);
    }

    public static boolean isHappy(int N) {
        for (int i = 0; i < 10; i++) {
            int sum = 0;

            while (N != 0) {
                int last_digit = N % 10;
                N = N / 10;
                sum += last_digit * last_digit;
            }
            N = sum;

            if (sum == 1) {
                return true;
            }
        }
        return false;
    }


}
