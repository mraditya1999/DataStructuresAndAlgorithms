package arrays;

import java.util.Scanner;

public class IsRotatedAndSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        boolean isRotatedAndSorted = isRotatedAndSorted(arr, length);
        System.out.println("Is Rotated And Sorted: " + isRotatedAndSorted);
    }

    public static boolean isRotatedAndSorted(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }

        if (arr[length - 1] > arr[0]) {
            count++;
        }
        return count <= 1;
    }
}
