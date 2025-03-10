package sorting_and_searching;
import arrays.ArrayOperations;

public class SelectionSort {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr,length);

        selectionSort(arr,length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr,length);
    }

    static void selectionSort(int[] arr,int length){
        //5 4 3 2 1
        for (int i = 0; i < length - 1 ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length ; j++) {
                if(arr[j] < arr[minIndex]){ //
                    minIndex = j;
                }
            }
            ArrayOperations.swap(arr,i ,minIndex);
        }
    }
}
