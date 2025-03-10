package arrays.two_pointers;

import arrays.ArrayOperations;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order.
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] sortedArray1 = {1,2,3,4,5,6,7,8,9,10};
        int[] sortedArray2 = {4,5,6,7,8,9,10};
        int length1 = sortedArray1.length;
        int length2 = sortedArray2.length;


        int[] sorted_arr = mergeTwoSortedArray(sortedArray1, sortedArray2,length1,length2);
        ArrayOperations.printArray(sorted_arr, sorted_arr.length);
    }

    static int[] mergeTwoSortedArray (int[] arr1, int[] arr2, int length1, int length2){
            int[] sorted_arr = new int[length1+length2];
            int i = 0, j = 0, k = 0;
            while(i < length1 && j < length2){
                if(arr1[i] <= arr2[j]){
                    sorted_arr[k++] = arr1[i++];
                } else{
                    sorted_arr[k++] = arr2[j++];
                }
            }

            while(i < length1){
                sorted_arr[k++] = arr1[i++];
            }

            while(j < length2){
                sorted_arr[k++] = arr2[j++];
            }

        return sorted_arr;
    }
}
