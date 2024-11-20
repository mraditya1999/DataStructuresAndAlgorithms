package sorting_searching;

import arrays.ArrayOperations;

public class InsertionSort {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

        insertionSort(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void insertionSort(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
