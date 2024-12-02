package arrays.prefix_suffix_sum;

import arrays.ArrayOperations;

public class EqualSumPartition {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        boolean isEqualSum1 = isEqualSumPartitionMethod1(arr, length);
        boolean isEqualSum2 = isEqualSumPartitionMethod2(arr, length);

        System.out.println("Is sub-array 1 equal to sub-array2: " + isEqualSum1);
        System.out.println("Is sub-array 1 equal to sub-array2: " + isEqualSum2);
    }

    public static boolean isEqualSumPartitionMethod1(int[] arr, int length) {
        int[] prefix_sum = PrefixSum.calculatePrefixSumMethod1(arr, length);
        int[] suffix_sum = SuffixSum.calculateSuffixSumMethod1(arr, length);

        //5 3 2 6 3 1 - arr
        //5 8 10 16 19 20 - prefix
        //20 15 12 10 4 1 - suffix
        for (int i = 0; i < length - 1; i++) {
            if (prefix_sum[i] == suffix_sum[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEqualSumPartitionMethod2(int[] arr, int length) {
        int totalSum = 0;
        for (int i = 0; i < length; i++) {
            totalSum += arr[i];
        }

        int prefix_sum = 0;
        for (int i = 0; i < length; i++) {
            prefix_sum += arr[i];
            int suffix_sum = totalSum - prefix_sum;
            if (prefix_sum == suffix_sum) return true;
        }
        return false;
    }
}
