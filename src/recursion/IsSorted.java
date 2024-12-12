package recursion;

import arrays.ArrayOperations;

public class IsSorted {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        boolean isSorted = isSorted(arr, length, 0);
        System.out.println("is Sorted: " + isSorted);
    }

    public static boolean isSorted(int[] arr, int length, int index) {
        if (index == length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSorted(arr, length, index + 1);
    }
}
