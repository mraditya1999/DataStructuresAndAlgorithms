package basics;

import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check armstrong: ");
        int N = sc.nextInt();

        boolean isArmstrongNumber = isArmstrongNumber(N);
        System.out.println("Is " + N + " Armstrong number: " + isArmstrongNumber);
    }

    static int countTotalNumberOfDigits(int N){
        int totalNoOfDigits = 0;
        while(N != 0){
            totalNoOfDigits++;
            N = N/10;
        }
        return totalNoOfDigits;
    }

    static boolean isArmstrongNumber(int N){
        int temp = N;
        int armstrongNumber = 0;
        int totalNoOfDigits = BasicOperations.countTotalNumberOfDigits(N);

        while(temp != 0){
            int remainder = temp % 10;
            armstrongNumber = armstrongNumber + (int) Math.pow(remainder,totalNoOfDigits);
            temp = temp / 10;
        }

        return armstrongNumber == N;
    }
}
