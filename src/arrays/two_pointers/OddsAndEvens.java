package arrays.two_pointers;

import arrays.ArrayOperations;

public class OddsAndEvens {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int length = arr.length;

        System.out.print("Before Rearranging: ");
        ArrayOperations.printArray(arr,length);

        rearrangeEvensAndOdds(arr,length);

        System.out.print("After Rearranging: ");
        ArrayOperations.printArray(arr,length);
    }

    //given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers.
    //the relative order of odd or even integers doesn't matter
    static void rearrangeEvensAndOdds(int[] arr, int length){
        int leftIndex = 0;
        int rightIndex = length - 1;

        while (leftIndex < rightIndex){
            int leftNumber = arr[leftIndex];
            int rightNumber = arr[rightIndex];

            if((leftNumber % 2) == 1  && (rightNumber % 2) == 0) {
                ArrayOperations.swap(arr,leftIndex,rightIndex);
                leftIndex++;
                rightIndex--;
            }
            if((leftNumber % 2) == 0) leftIndex++;
            if((rightNumber % 2) == 1) rightIndex--;
        }
    }
}
