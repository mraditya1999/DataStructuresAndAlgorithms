package arrays.target_sum;

import arrays.ArrayOperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Enter value of Target sum: ");
        int targetSum = sc.nextInt();

        // Find and print the indices using the first method
        int[] indexPairs1 = twoSumMethod1(arr, length, targetSum);
        System.out.println("Indexes using twoSumMethod1: " + indexPairs1[0] + " " + indexPairs1[1]);

        // Find and print the indices using the second method
        int[] indexPairs2 = twoSumMethod2(arr, length, targetSum);
        System.out.println("Indexes using twoSumMethod2: " + indexPairs2[0] + " " + indexPairs2[1]);
    }

    public static int[] twoSumMethod1(int[] arr, int length, int targetSum) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == targetSum) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumMethod2(int[] arr, int length, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            int complement = targetSum - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
}
