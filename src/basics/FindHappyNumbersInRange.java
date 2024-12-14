package basics;

import java.util.Scanner;

public class FindHappyNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();

        findHappyNumbersInRange(lowerBound, upperBound);
    }

    public static void findHappyNumbersInRange(int lowerBound, int upperBound) {
        System.out.println("Happy numbers in the range [" + lowerBound + ", " + upperBound + "]:");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (IsHappyNumber.isHappy(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
