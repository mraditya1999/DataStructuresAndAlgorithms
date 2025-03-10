package arrays.two_pointers;

import arrays.ArrayOperations;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5,5,6};
        int length = arr.length;

        System.out.print("Before Removing: ");
        ArrayOperations.printArray(arr,length);

        int ans = removeDuplicatesInSortedArray(arr,length);

        System.out.print("After Removing: ");
        ArrayOperations.printArray(arr,ans);
    }

    //  Given an arr 'a' sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once
    //  You must have the result be placed i first-part of the array 'a'.
    //  If there are k elements after removing the duplicates, then the firs k elements of 'a' should hold the final result. It doesn't matter what you leave beyond the k elements.
    //  NOTE: Do not allocate extra space for another array.
    static int removeDuplicatesInSortedArray(int[] arr, int length){
        int leftIndex = 0;
        int rightIndex = 1;
        int k = 0;

        while (rightIndex < length){
            int leftNumber = arr[leftIndex];
            int rightNumber = arr[rightIndex];

            if(leftNumber == rightNumber) {
                rightIndex++;
            } else{
                leftIndex++;
                k++;
                arr[leftIndex] = rightNumber;
            }
        }
        return leftIndex;
    }
}
