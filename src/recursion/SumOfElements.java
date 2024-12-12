package recursion;

import arrays.ArrayOperations;

public class SumOfElements {

    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        int sumOfElements = sumOfElements(arr, length, 0);
        System.out.println("Sum Of Elements: " + sumOfElements);
    }

    public static int sumOfElements(int[] arr, int length, int index) {
        if (index == length) {
            return 0;
        }
        return arr[index] + sumOfElements(arr, length, index + 1);
    }
}
