package sorting_searching;

import arrays.ArrayOperations;

public class SelectionSort {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

//        selectionSort(arr, length);
        selectionSortOptimized(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void selectionSort(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            int smallest = i;
            for (int j = i + 1; j < length; j++) {
                count++;
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            ArrayOperations.swap(arr, smallest, i);
        }
        System.out.println("No of Iterations: " + count);
    }


    public static void selectionSortOptimized(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            boolean flag = true;
            int smallest = i;
            for (int j = i + 1; j < length; j++) {
                count++;
                if (arr[smallest] > arr[j]) {
                    flag = false;
                    smallest = j;
                }
            }
            if (smallest != i)
                ArrayOperations.swap(arr, smallest, i);
            if (flag) break;
        }
        System.out.println("No of Iterations: " + count);
    }
}
