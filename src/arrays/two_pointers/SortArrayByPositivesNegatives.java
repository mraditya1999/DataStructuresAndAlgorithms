package arrays.two_pointers;

import arrays.ArrayOperations;
import arrays.SortArray;

import java.util.Arrays;

public class SortArrayByPositivesNegatives {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
//int[5] arr = {-4,-1,0,3,10};
//        -4 -1 0 3 10
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements:");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

//        sortByPositivesNegativesMethod1(arr, length);
        sortByPositivesNegativesMethod2(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void sortByPositivesNegativesMethod1(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        SortArray.sortArray(arr, length);
    }

    public static void sortByPositivesNegativesMethod2(int[] arr, int length) {
        int[] result = new int[length];
        int leftIndex = 0;
        int rightIndex = length - 1;
        int k = length - 1;

        while (leftIndex <= rightIndex) {
            int leftValue = arr[leftIndex];
            int rightValue = arr[rightIndex];

            if (Math.abs(leftValue) > Math.abs(rightValue)) {
                result[k--] = leftValue * leftValue;
                leftIndex++;
            } else {
                result[k--] = rightValue * rightValue;
                rightIndex--;
            }
        }

        for (int i = 0; i < length; i++) {
            arr[i] = result[i];
        }
    }

}
