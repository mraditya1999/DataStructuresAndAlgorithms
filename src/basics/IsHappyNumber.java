package basics;

import java.util.Scanner;

public class IsHappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();

        findHappyNumbersInRange(lowerBound, upperBound);
    }

    public static boolean isHappyNumber(int N) {
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

    public static void findHappyNumbersInRange(int lowerBound, int upperBound) {
        System.out.println("Happy numbers in the range [" + lowerBound + ", " + upperBound + "]:");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isHappyNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
