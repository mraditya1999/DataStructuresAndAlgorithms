package arrays.target_sum;

import arrays.ArrayOperations;

import java.util.Scanner;

public class TargetSumOfTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Enter value of Target sum: ");
        int targetSum = sc.nextInt();

        int totalNoOfPairs = countNoOfPairsTargetSum(arr, length, targetSum);
        System.out.println("Total No. Of Pairs Equal to " + totalNoOfPairs);
    }

    public static int countNoOfPairsTargetSum(int[] arr, int length, int targetSum) {
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                    count++;
                }
            }
        }
        System.out.println();
        return count;
    }
}
