package arrays.two_pointers;
import arrays.ArrayOperations;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Enter how many times you want to rotate: ");
        int noOfRotations = getRotationCount();

        System.out.print("Before rotate: ");
        ArrayOperations.printArray(arr, length);

        leftRotateArray(arr, noOfRotations,length);
        System.out.print("After left rotate: ");
        ArrayOperations.printArray(arr, length);

        rightRotateArray(arr, noOfRotations,length);
        System.out.print("After right rotate: ");
        ArrayOperations.printArray(arr, length);
    }

    static int getRotationCount() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static void leftRotateArray(int[] arr, int N,int length) {
        N = N % length;
        reverseArray(arr, 0, N - 1);
        reverseArray(arr, N, length - 1);
        reverseArray(arr, 0, length - 1);
    }

    static void rightRotateArray(int[] arr, int N, int length) {
        N = N % length;
        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, N - 1);
        reverseArray(arr, N, length - 1);
    }

    static void reverseArray(int[] arr, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            ArrayOperations.swap(arr, leftIndex, rightIndex);
            leftIndex++;
            rightIndex--;
        }
    }
}
