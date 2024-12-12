package recursion;

import arrays.ArrayOperations;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        boolean isExist = isExist(arr, length, key, 0);
        System.out.println("Is Exist: " + isExist);

        ifIsExistPrint(arr, length, key, 0);
    }

    public static boolean isExist(int[] arr, int length, int key, int index) {
        if (index == length) {
            return false;
        }

        if (arr[index] == key) {
            return true;
        }
        return isExist(arr, length, key, index + 1);
    }

    // I/P => 1 2 3 4 2 5
    // O/P => 1 4
    public static void ifIsExistPrint(int[] arr, int length, int key, int index) {
        if (index == length) {
            return;
        }

        if (arr[index] == key) {
            System.out.println("Index: " + index);
        }
        ifIsExistPrint(arr, length, key, index + 1);
    }
}
