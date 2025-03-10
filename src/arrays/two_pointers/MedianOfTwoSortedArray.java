package arrays.two_pointers;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] sortedArray1 = {1,3};
        int[] sortedArray2 = {2};
        int length1 = sortedArray1.length;
        int length2 = sortedArray2.length;

        int[] merged_arr = MergeTwoSortedArray.mergeTwoSortedArray(sortedArray1, sortedArray2,length1,length2);
        int length = merged_arr.length;
        double median = calculateMedianOfTwoSortedArray(merged_arr, length);
        System.out.println("Median of two sorted array is: " + median);
    }

    static double calculateMedianOfTwoSortedArray(int[] merged_arr, int length){
        int median = length / 2;

        if(length % 2 == 0){
            return (double) (merged_arr[median] + merged_arr[median - 1]) / 2;
        }
        return merged_arr[median];
    }
}
