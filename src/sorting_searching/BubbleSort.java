package sorting_searching;

import arrays.ArrayOperations;

public class BubbleSort {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

        bubbleSort(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);

    }

    public static void bubbleSort(int[] arr, int length) {
        boolean flag;
        for (int i = 0; i < length - 1; i++) {
            flag = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayOperations.swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
