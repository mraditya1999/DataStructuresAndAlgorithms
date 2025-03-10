package sorting_and_searching;

import arrays.ArrayOperations;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr =  ArrayOperations.initializeArray(length);

        System.out.print("Enter " +  length + " elements in sorted order: ");
        ArrayOperations.populateArray(arr,length);

        int key = getKeyElement();
        boolean isFound = binarySearch(arr,length,key);
        System.out.println("Is " + key + " Found: " + isFound);
    }

    public static int getKeyElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to find: ");
        return sc.nextInt();
    }

    // Array must be sorted
    public static boolean binarySearch(int[] arr , int length, int key){
        int start = 0;
        int end = length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                return true;
            }else if(arr[mid] > key){
                end  = mid - 1;
            }else{
                start = mid  + 1;
            }
        }
        return false;
    }


}
