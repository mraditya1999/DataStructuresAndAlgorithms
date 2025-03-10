package arrays.two_pointers;

import arrays.ArrayOperations;

public class SquaresPositivesAndNegatives {
    public static void main(String[] args) {
        int[] arr = {-5,-4,-3,-3,1,2,3,4};
        int length = arr.length;

        System.out.print("Before Rearranging: ");
        ArrayOperations.printArray(arr,length);

        int[] ans = rearrangeNegativesAndPositives(arr,length);

        System.out.print("After Rearranging: ");
        ArrayOperations.printArray(ans,length);
    }

    //given an array of integers 'a' sorted in non-decreasing order, return an array of the squares of each number in non-decreasing order.
    // array should be sorted
    static int[] rearrangeNegativesAndPositives(int[] arr, int length){
        int leftIndex = 0;
        int rightIndex = length - 1;
        int[] ans = new int[length];
        int index = 0;

        while (leftIndex <= rightIndex){
            int leftNumber = Math.abs(arr[leftIndex]);
            int rightNumber = Math.abs(arr[rightIndex]);

            if(leftNumber > rightNumber) {
                ans[index++] = leftNumber * leftNumber;
                leftIndex++;
            } else {
                ans[index++] = rightNumber * rightNumber; // 5 4
                rightIndex--;
            }
        }
        ArrayOperations.reverseArray(ans, length);
        return ans;
    }
}
