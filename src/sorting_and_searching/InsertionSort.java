package sorting_and_searching;

import arrays.ArrayOperations;

public class InsertionSort {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr,length);

        insertionSort(arr,length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr,length);

    }
    
    static void insertionSort(int[] arr, int length){
        for (int i = 1; i < length ; i++) {
            int j = i;
            while( j > 0 && arr[j] < arr[j - 1]){
                ArrayOperations.swap(arr,j,j-1);
                j--;
            }
        }
    }
}
