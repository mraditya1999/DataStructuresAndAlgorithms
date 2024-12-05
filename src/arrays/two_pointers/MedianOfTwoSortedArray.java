package arrays.two_pointers;

import arrays.ArrayOperations;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 4, 4};

        int[] mergedArray = mergeTwoSortedArray(arr1, arr2);
        double median = medianOfTwoSortedArray(mergedArray, mergedArray.length);

        System.out.print("Median: " + median);
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[length1 + length2];

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < length1) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < length2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static double medianOfTwoSortedArray(int[] mergedArray, int length) {
        if (length % 2 == 0) {
            return (mergedArray[length / 2 - 1] + (double) mergedArray[length / 2]) / 2;
        } else {
            return mergedArray[length / 2];
        }
    }

}
