package arrays.two_pointers;

import arrays.ArrayOperations;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 5};
        int[] arr2 = {3, 3, 6, 7, 8, 9, 10};

        int[] arr3 = mergeTwoSortedArray(arr1, arr2);

        ArrayOperations.printArray(arr3, arr3.length);
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }
}
