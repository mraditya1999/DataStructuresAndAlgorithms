package arrays.prefix_suffix_sum;

import arrays.ArrayOperations;

public class SuffixSum {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

//        int[] suffix_sum = calculateSuffixSumMethod1(arr, length);
//        int[] suffix_sum = calculateSuffixSumMethod2(arr, length);
        int[] suffix_sum = calculateSuffixSumMethod3(arr, length);
        ArrayOperations.printArray(suffix_sum, length);
    }

    public static int[] calculateSuffixSumMethod1(int[] arr, int length) {
        int[] suffix_sum = new int[length];
        suffix_sum[length - 1] = arr[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            suffix_sum[i] = arr[i] + suffix_sum[i + 1];
        }
        return suffix_sum;
    }

    public static int[] calculateSuffixSumMethod2(int[] arr, int length) {
        int sum = 0;
        for (int i = length - 1; i >= 0; i--) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }

    public static int[] calculateSuffixSumMethod3(int[] arr, int length) {
        for (int i = length - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }
        return arr;
    }
}
