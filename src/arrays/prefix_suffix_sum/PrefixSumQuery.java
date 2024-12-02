package arrays.prefix_suffix_sum;

import arrays.ArrayOperations;

import java.util.Scanner;

public class PrefixSumQuery {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.println("Enter first element 0 because of 1-based indexing");
        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        int totalNoOfQueries = getTotalNoOfQueries();
        int prefix_sum = calculatePrefixSumQuery(arr, length, totalNoOfQueries);
        System.out.println("Sum is: " + prefix_sum);
    }

    public static int getTotalNoOfQueries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of queries you want to run: ");
        return sc.nextInt();
    }

    public static int calculatePrefixSumQuery(int[] arr, int length, int totalNoOfQueries) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int[] prefix_sum = PrefixSum.calculatePrefixSumMethod3(arr, length);

        while (totalNoOfQueries-- > 0) {
            System.out.print("Enter range: ");
            int left = sc.nextInt();
            int right = sc.nextInt();

            ans = prefix_sum[right] - prefix_sum[left - 1];
        }
        return ans;
    }
}
