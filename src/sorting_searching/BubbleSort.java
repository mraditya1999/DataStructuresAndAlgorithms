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

//        bubbleSort(arr, length);
        bubbleSortOptimized(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void bubbleSort(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    ArrayOperations.swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("No of Iterations: " + count);
    }


    public static void bubbleSortOptimized(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            boolean flag = true;
            for (int j = 0; j < length - 1 - i; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    ArrayOperations.swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag) break;
        }
        System.out.println("No of Iterations: " + count);
    }
}
