package arrays.two_pointers;

import arrays.ArrayOperations;

import java.util.Arrays;

public class SetOperations {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 4, 4};

        System.out.print("Intersection: ");
        int[] intersectionArray = intersectionOfTwoSortedArrays(arr1, arr2);
        ArrayOperations.printArray(intersectionArray, intersectionArray.length);

        System.out.print("Union: ");
        int[] unionArray = unionOfTwoSortedArrays(arr1, arr2);
        ArrayOperations.printArray(unionArray, unionArray.length);

        System.out.print("Difference: ");
        int[] differenceArray = differenceOfTwoSortedArrays(arr1, arr2);
        ArrayOperations.printArray(differenceArray, differenceArray.length);
    }

    public static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] tempArray = new int[length1 + length2];

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                tempArray[k++] = arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                tempArray[k++] = arr2[j++];
            } else {
                if (k == 0 || tempArray[k - 1] != arr1[i]) {
                    tempArray[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while (i < length1) {
            if (k == 0 || tempArray[k - 1] != arr1[i])
                tempArray[k++] = arr1[i];
            i++;
        }

        while (j < length2) {
            if (k == 0 || tempArray[k - 1] != arr2[j])
                tempArray[k++] = arr2[j];
            j++;
        }

        return Arrays.copyOf(tempArray, k);
    }

    public static int[] intersectionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] tempArray = new int[Math.min(length1, length2)];

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) i++;
            else if (arr2[j] < arr1[i]) j++;
            else {
                if (k == 0 || tempArray[k - 1] != arr1[i])
                    tempArray[k++] = arr1[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOf(tempArray, k);
    }

    public static int[] differenceOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] tempArray = new int[length1];

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                tempArray[k++] = arr1[i++];
            } else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        while (i < length1) {
            tempArray[k++] = arr1[i++];
        }
        return Arrays.copyOf(tempArray, k);
    }
}
