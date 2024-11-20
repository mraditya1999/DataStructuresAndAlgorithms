package sorting_searching;

import arrays.ArrayOperations;

public class MergeSort {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

        mergeSort(arr, length - 1);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void mergeSort(int[] arr, int length) {
        divide(arr, 0, length);
    }

    public static void divide(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            divide(arr, left, mid);
            divide(arr, mid + 1, right);
            conquer(arr, left, mid, right);
        }
    }

    public static void conquer(int[] arr, int left, int mid, int right) {
        int[] merged = new int[right - left + 1];
        int idx1 = left;
        int idx2 = mid + 1;
        int k = 0;

        while (idx1 <= mid && idx2 <= right) {
            if (arr[idx1] <= arr[idx2]) {
                merged[k++] = arr[idx1++];
            } else {
                merged[k++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[k++] = arr[idx1++];
        }
        while (idx2 <= right) {
            merged[k++] = arr[idx2++];
        }

        // Copy the merged array back to the original array
        for (int i = 0; i < merged.length; i++) {
            arr[left + i] = merged[i];
        }
    }
}
