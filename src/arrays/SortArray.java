package arrays;

public class SortArray {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

        sortArray(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);

    }

    public static void sortArray(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            boolean flag = false;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    ArrayOperations.swap(arr, i, j);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}