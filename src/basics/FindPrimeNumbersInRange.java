package basics;

import java.util.Scanner;

public class FindPrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();

        displayPrimeNumbers(lowerBound, upperBound);
    }

    public static void displayPrimeNumbers(int lowerBound, int upperBound) {
        System.out.println("Happy numbers in the range [" + lowerBound + ", " + upperBound + "]:");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (IsPrimeNumber.isPrimeMethod2(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

