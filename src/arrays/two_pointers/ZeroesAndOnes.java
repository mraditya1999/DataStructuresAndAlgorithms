package arrays.two_pointers;

import arrays.ArrayOperations;

public class ZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,0,0,1,1,0,1};
        int length = arr.length;

        System.out.print("Before Rearranging: ");
        ArrayOperations.printArray(arr,length);

        rearrangeZeroesAndOnesMethod1(arr,length);

        System.out.print("After Rearranging: ");
        ArrayOperations.printArray(arr,length);
    }

    static void rearrangeZeroesAndOnesMethod1(int[] arr, int length){
        int leftIndex = 0;
        int rightIndex = length - 1;

        while (leftIndex < rightIndex){
            int leftNumber = arr[leftIndex];
            int rightNumber = arr[rightIndex];

            if(leftNumber == 1 && rightNumber == 0) {
                ArrayOperations.swap(arr,leftIndex,rightIndex);
                leftIndex++;
                rightIndex--;
            }
            if(arr[leftIndex] == 0) leftIndex++;
            if(arr[rightIndex] == 1) rightIndex--;
        }
    }

    static void rearrangeZeroesAndOnesMethod2(int[] arr, int length){
        int zeroCount = 0;
        for (int element : arr){
            if(element == 0) zeroCount++;
        }

        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        for (int i = zeroCount; i < length; i++) {
            arr[i] = 1;
        }
    }
}
