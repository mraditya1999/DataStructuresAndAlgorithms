package arrays.two_pointers;

import arrays.ArrayOperations;
import java.util.Scanner;

public class SetOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Union");
        System.out.println("2. Intersection");
        System.out.println("3. Difference");
        System.out.print("Select operation to perform: ");
        int choice = scanner.nextInt();

        int length1 = ArrayOperations.getArrayLength();
        int[] arr1 = ArrayOperations.initializeArray(length1);
        System.out.print("Enter " + length1 + " elements of First array: ");
        ArrayOperations.populateArray(arr1, length1);

        int length2 = ArrayOperations.getArrayLength();
        int[] arr2 = ArrayOperations.initializeArray(length2);
        System.out.print("Enter " + length2 + " elements of Second array: ");
        ArrayOperations.populateArray(arr2, length2);

        int[] ans = ArrayOperations.initializeArray(length1 + length2);
        int length = 0;

        switch (choice) {
            case 1:
                length = findUnionOfTwoSortedArray(arr1, arr2, length1, length2, ans);
                System.out.print("Union of the two arrays is: ");
                break;
            case 2:
                length = findIntersectionOfTwoSortedArray(arr1, arr2, length1, length2, ans);
                System.out.print("Intersection of the two arrays is: ");
                break;
            case 3:
                length = findDifferenceOfTwoSortedArray(arr1, arr2, length1, length2, ans);
                System.out.print("Difference of the two arrays is: ");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        ArrayOperations.printArray(ans, length);
    }

    static int findUnionOfTwoSortedArray(int[] arr1, int[] arr2, int length1, int length2, int[] ans) {
        int i = 0, j = 0, index = 0;

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                ans[index++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                ans[index++] = arr2[j++];
            } else {
                ans[index++] = arr1[i];
                i++;
                j++;
            }
        }

        while (i < length1) {
            ans[index++] = arr1[i++];
        }

        while (j < length2) {
            ans[index++] = arr2[j++];
        }

        return index;
    }

    static int findIntersectionOfTwoSortedArray(int[] arr1, int[] arr2, int length1, int length2, int[] ans) {
        int i = 0, j = 0, index = 0;

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                ans[index++] = arr1[i];
                i++;
                j++;
            }
        }
        return index;
    }

    static int findDifferenceOfTwoSortedArray(int[] arr1, int[] arr2, int length1, int length2, int[] ans) {
        int i = 0, j = 0, index = 0;

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                ans[index++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < length1) {
            ans[index++] = arr1[i++];
        }

        return index;
    }
}
