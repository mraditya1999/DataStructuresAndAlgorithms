package sorting_searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        boolean isFound1 = binarySearchIterative(key, arr);
        System.out.print("is Found: " + isFound1);

        System.out.println();

        boolean isFound2 = binarySearchRecursive(key, arr, 0, arr.length - 1);
        System.out.print("is Found: " + isFound2);

    }

    public static boolean binarySearchIterative(int key, int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) return true;
            else if (arr[mid] < key) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    public static boolean binarySearchRecursive(int key, int[] arr, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2; //4

            if (arr[mid] == key) return true;
            else if (arr[mid] < key) start = mid + 1;
            else end = mid - 1;
            return binarySearchRecursive(key, arr, start, end);
        }
        return false;
    }
}
