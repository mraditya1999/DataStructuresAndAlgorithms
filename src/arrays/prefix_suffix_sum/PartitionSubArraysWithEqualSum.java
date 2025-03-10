package arrays.prefix_suffix_sum;
import arrays.ArrayOperations;

public class PartitionSubArraysWithEqualSum {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        boolean isEqualPartitionPossible = equalSumPartition(arr, length);
        System.out.println("Is Equal partition possible: " + isEqualPartitionPossible);
    }

    // check if we can partition the array into sub-arrays with equal sum.
    // More formally. check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array
    static boolean equalSumPartition(int[] arr, int length){
        int total_sum = ArrayOperations.calculateTotalSum(arr,length);
        int prefix_sum = 0;

        for (int i = 0; i < length; i++) {
            prefix_sum +=  arr[i];
            int suffix_sum = total_sum - prefix_sum;
            if(prefix_sum == suffix_sum) return true;
        }
        return false;
    }
}
