package arrays;

import java.util.Scanner;

public class FindMaxAndMinElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        int minElement = findMinElement(arr, length);
        int maxElement = findMaxElement(arr, length);

        System.out.println("Min Element: " + minElement);
        System.out.println("Max Element: " + maxElement);
    }

    public static int findMinElement(int[] arr, int length) {
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr[i] < minElement) minElement = arr[i];
        }
        return minElement;
    }

    public static int findMaxElement(int[] arr, int length) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr[i] > maxElement) maxElement = arr[i];
        }
        return maxElement;
    }
}
