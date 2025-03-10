package sorting_and_searching;
import arrays.ArrayOperations;

public class BubbleSort {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr,length);

//        bubbleSortMethod1(arr,length);
//        bubbleSortMethod2(arr,length);
        bubbleSortMethod3(arr,length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr,length);

    }

    static void bubbleSortMethod1(int[] arr, int length){
        for (int i = 0; i < length; i++) {
            //5 4 3 2 1
            for (int j = 0; j < length - 1; j++) {
                if(arr[j] > arr[j+1]){ //1 2 3 4 5
                    ArrayOperations.swap(arr,j,j+1);
                }
            }
        }
    }

    // in each iteration of 'i' last elements is sorted, so no need to sort again
    static void bubbleSortMethod2(int[] arr, int length){
        for (int i = 0; i < length - 1 ; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                    if(arr[j] > arr[j+1]){ //1 2 3 4 5
                        ArrayOperations.swap(arr,j,j+1);
                    }
            }
        }
    }

    // sort nearly sorted array
    static void bubbleSortMethod3(int[] arr, int length){
        for (int i = 0; i < length - 1 ; i++) {
        boolean isSwapped = false; // has any swapping happened
            for (int j = 0; j < length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    isSwapped = true;
                    ArrayOperations.swap(arr,j,j+1);
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}
