package arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

        int index = getInsertionIndex();
        removeElementAtGivenIndex(arr, length, index);
        length--;

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static int getInsertionIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index at which you want to insert: ");
        return sc.nextInt();
    }

    public static void removeElementAtGivenIndex(int[] arr, int length, int index) {
        for (int i = index; i < length; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
