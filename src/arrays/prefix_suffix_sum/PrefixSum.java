package arrays.prefix_suffix_sum;
import arrays.ArrayOperations;

public class PrefixSum {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

         //int[] prefix_sum = calculatePrefixSumMethod1(arr, length);
        // int[] prefix_sum = calculatePrefixSumMethod2(arr, length);
        int[] prefix_sum = calculatePrefixSumMethod3(arr, length);
        ArrayOperations.printArray(prefix_sum, length);
    }

//    Given an integer array 'a', calculate prefix sum in the same array without creating a new array.
    static int[] calculatePrefixSumMethod1(int[] arr,int length) {
        int[] prefix_sum = new int[length];
        prefix_sum[0] = arr[0];

        for (int i = 1; i < length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        return prefix_sum;
    }

    static int[] calculatePrefixSumMethod2(int[] arr, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
            arr[i] = sum;
        }
        return arr;
    }

    static int[] calculatePrefixSumMethod3(int[] arr,int length) {
        for (int i = 1; i < length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
}
