package arrays;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

        int value = getElementToInsert();
        int index = getInsertionIndex();
        insertElementAtGivenIndex(arr, length, index, value);
        length++;

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static int getElementToInsert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value you want to insert: ");
        return sc.nextInt();
    }

    public static int getInsertionIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index at which you want to insert: ");
        return sc.nextInt();
    }

    public static void insertElementAtGivenIndex(int[] arr, int length, int index, int value) {
        for (int i = length; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }
}
