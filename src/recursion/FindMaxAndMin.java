package recursion;

import arrays.ArrayOperations;

public class FindMaxAndMin {

    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        int maxValue = findMax(arr, length, 0);
        int minValue = findMin(arr, length, 0);

        System.out.println("Max Value is: " + maxValue);
        System.out.println("Min Value is: " + minValue);
    }

    public static int findMax(int[] arr, int length, int index) {
        if (index == length) {
            return Integer.MIN_VALUE;
        }
        return Math.max(arr[index], findMax(arr, length, index + 1));
    }

    public static int findMin(int[] arr, int length, int index) {
        if (index == length) {
            return Integer.MAX_VALUE;
        }
        return Math.min(arr[index], findMin(arr, length, index + 1));
    }
}
