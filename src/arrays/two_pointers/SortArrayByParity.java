package arrays.two_pointers;

import arrays.ArrayOperations;

public class SortArrayByParity {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements:");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

        sortArrayByParity(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void sortArrayByParity(int[] arr, int length) {
        int start = 0;
        int end = length - 1;

        while (start < end) {
            if (arr[start] % 2 == 0) start++;
            if (arr[end] % 2 != 0) end--;
            else {
                ArrayOperations.swap(arr, start, end);
                start++;
                end--;
            }
        }
    }
}
