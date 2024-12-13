package recursion;

import arrays.ArrayOperations;

import java.util.Scanner;

public class LastIndexOfKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int lastIndex = searchElement(arr, length, key, length - 1);
        System.out.println("Last Index of key is: " + lastIndex);
    }

    public static int searchElement(int[] arr, int length, int key, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == key) return index;
        return searchElement(arr, length, key, index - 1);
    }
}
