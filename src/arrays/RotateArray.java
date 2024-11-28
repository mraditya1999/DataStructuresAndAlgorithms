package arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.println("1.Rotate clockwise\t2.Rotate anti-clockwise\t");
        int choice;
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        int k;
        System.out.print("Enter Kth value to rotate: ");
        k = sc.nextInt();

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

        switch (choice) {
            case 1:
                rotateClockwiseMethod2(arr, length, k);
                break;

            case 2:
                rotateAntiClockwiseMethod2(arr, length, k);
                break;
        }

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        end = end - 1; // Adjust end to be inclusive
        while (start < end) {
            ArrayOperations.swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void rotateClockwiseMethod1(int[] arr, int length, int k) {
        k = k % length;
        while (k != 0) {
            int lastElement = arr[length - 1];
            for (int i = length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = lastElement;
            k--;
        }
    }

    public static void rotateAntiClockwiseMethod1(int[] arr, int length, int k) {
        k = k % length;
        while (k != 0) {
            int firstElement = arr[0];
            for (int i = 0; i < length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[length - 1] = firstElement;
            k--;
        }
    }

    public static void rotateClockwiseMethod2(int[] arr, int length, int k) {
        k = k % length;
        if (k != 0) {
            reverseArray(arr, 0, length);
            reverseArray(arr, 0, k - 1);
            reverseArray(arr, k, length);
        }
    }

    public static void rotateAntiClockwiseMethod2(int[] arr, int length, int k) {
        k = k % length;
        if (k != 0) {
            reverseArray(arr, 0, length);
            reverseArray(arr, 0, length - k - 1);
            reverseArray(arr, length - k, length);
        }
    }
}
