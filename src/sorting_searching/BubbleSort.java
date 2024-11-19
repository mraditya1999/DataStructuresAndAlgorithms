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

        bubbleSortMethod1(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);

    }

    public static void bubbleSortMethod1(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            count++;
            for (int j = 0; j < length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(count);
    }
}
