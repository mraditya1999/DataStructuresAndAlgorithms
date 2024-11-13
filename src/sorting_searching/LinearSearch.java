package sorting_searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        boolean isFound1 = linearSearchIterative(key, arr);
        System.out.print("is Found: " + isFound1);

        System.out.println();

        boolean isFound2 = linearSearchRecursive(key, arr, 0);
        System.out.print("is Found: " + isFound2);
    }

    public static boolean linearSearchIterative(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return true;
        }
        return false;
    }

    public static boolean linearSearchRecursive(int key, int[] arr, int count) {
        if (count >= arr.length) {
            return false;
        }

        if (arr[count] == key) {
            return true;
        }
        return linearSearchRecursive(key, arr, count + 1);
    }
}

