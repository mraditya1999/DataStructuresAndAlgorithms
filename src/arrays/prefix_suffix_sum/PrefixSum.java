package arrays.prefix_suffix_sum;

import arrays.ArrayOperations;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements:");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

//        getPrefixSumMethod1(arr, length);
        getPrefixSumMethod2(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void getPrefixSumMethod1(int[] arr, int length) {
        int[] temp = new int[length];
        temp[0] = arr[0];
        for (int i = 1; i < length; i++) {
            temp[i] = arr[i] + temp[i - 1];
        }
        ArrayOperations.printArray(temp, length);
        for (int i = 0; i < length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void getPrefixSumMethod2(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
}
