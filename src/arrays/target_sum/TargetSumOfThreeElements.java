package arrays.target_sum;

import arrays.ArrayOperations;

import java.util.Scanner;

public class TargetSumOfThreeElements {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr,length);

        int targetValue = getTargetValue();
        int targetSum1 = targetSumMethod1(arr,length,targetValue);
        System.out.println("Total no. of pairs whose sum is equal to: " + targetValue + " is: " + targetSum1);
    }

    static int getTargetValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        return sc.nextInt();
    }

    //  Find the total no. of pairs in the array whose sum is equal to the given value x
    static int targetSumMethod1(int[] arr, int length, int targetValue){
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length ; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                        if(sum == targetValue) {
                            count++;
                            System.out.print("Index of pairs is: ");
                            System.out.println("(" +  i + " , " + j + " , " + k +")");
                        }
                }
            }
        }
        return count;
    }

    static int targetSumMethod2(int[] arr, int length, int targetValue){
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length ; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == targetValue) {
                        count++;
                        System.out.print("Index of pairs is: ");
                        System.out.println("(" +  i + " , " + j + " , " + k +")");
                    }
                }
            }
        }
        return count;
    }
}
