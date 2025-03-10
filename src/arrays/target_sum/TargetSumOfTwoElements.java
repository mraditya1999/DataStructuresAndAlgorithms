package arrays.target_sum;
import arrays.ArrayOperations;
import java.util.Scanner;

public class TargetSumOfTwoElements {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr,length);

        int targetValue = getTargetValue();

        int targetSum1 = targetSumMethod1(arr,length,targetValue);
        int targetSum2 = targetSumMethod2(arr,length,targetValue);
        int targetSum3 = targetSumMethod3(arr,length,targetValue);

        System.out.println("Total no. of pairs whose sum is equal to: " + targetValue + " is: " + targetSum1);
        System.out.println("Total no. of pairs whose sum is equal to: " + targetValue + " is: " + targetSum2);
        System.out.println("Total no. of pairs whose sum is equal to: " + targetValue + " is: " + targetSum3);
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
                int sum = arr[i] + arr[j];
               if(sum == targetValue) {
                   count++;
                   System.out.print("Value of pairs is: ");
                   System.out.println("(" +  arr[i] + " , " + arr[j] +")");
               }
            }
        }
        return count;
    }

    // can be used only in sorted array (binary search approach)
    static int targetSumMethod2(int[] arr, int length, int targetValue){
        int count = 0;

        for (int i = 0; i < length - 1; i++) {
            int diffElement = targetValue - arr[i]; // 4 3 2
            boolean isPresent = searchElement(arr, length , diffElement, i + 1, length - 1 );

            if (isPresent){
                count++;
                System.out.print("Value of pairs is: ");
                System.out.println("(" +  arr[i] + " , " + diffElement +")");
            }
        }
        return count;
    }

    // can be used only in sorted array (two-pointer approach)
    static int targetSumMethod3(int[] arr, int length, int targetValue){
        int count = 0;
        int start = 0;
        int end = length - 1;

        while(start < end){

            int sum = arr[start] + arr[end];
            if(sum == targetValue) {
                count++;
                System.out.print("Value of pairs is: ");
                System.out.println("(" +  arr[start] + " , " + arr[end] +")");
                start++;
                end--;
            }
            else if (sum > targetValue) {
                end--;
            }else{
                start++;
            }
        }

        return count;
    }

    public static boolean searchElement(int[] arr, int length, int key, int start, int end ){
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
