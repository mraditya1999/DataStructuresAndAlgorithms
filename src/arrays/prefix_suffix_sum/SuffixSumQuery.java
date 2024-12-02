package arrays.prefix_suffix_sum;

import arrays.ArrayOperations;

import java.util.Scanner;

public class SuffixSumQuery {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.println("Enter first element 0 because of 1-based indexing");
        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        int totalNoOfQueries = getTotalNoOfQueries();
        int suffix_sum = calculateSuffixSumQuery(arr, length, totalNoOfQueries);
        System.out.println("Sum is: " + suffix_sum);
    }

    public static int getTotalNoOfQueries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of queries you want to run: ");
        return sc.nextInt();
    }

    public static int calculateSuffixSumQuery(int[] arr, int length, int totalNoOfQueries) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int[] suffix_sum = SuffixSum.calculateSuffixSumMethod3(arr, length);

        while (totalNoOfQueries-- > 0) {
            System.out.print("Enter range: ");
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left < 1 || right >= length || left > right) {
                System.out.println("Invalid range. Please enter a valid range.");
                continue;
            }
            ans = suffix_sum[right] - (left > 0 ? suffix_sum[left - 1] : 0);
        }
        return ans;
    }
}
