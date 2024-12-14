package basics;

import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        int totalNoOfDigits = countTotalNoOfDigits(N);
        boolean isArmstrong = isArmstrong(N, totalNoOfDigits);
        System.out.println("Is Armstrong: " + isArmstrong);
    }

    public static int countTotalNoOfDigits(int N) {
        int count = 0;
        while (N != 0) {
            count++;
            N = N / 10;
        }
        return count;
    }

    public static boolean isArmstrong(int N, int totalNoOfDigits) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, totalNoOfDigits);
            temp = temp / 10;
        }
        return sum == N;
    }
}
