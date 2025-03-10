package sorting_and_searching;
import arrays.ArrayOperations;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr =  ArrayOperations.initializeArray(length);

        System.out.print("Enter " +  length + " elements: ");
        ArrayOperations.populateArray(arr,length);

        int key = getKeyElement();
        boolean isFound = linearSearchIterative(arr,length,key);

        System.out.println("Is " + key + " Found: " + isFound);
    }

    public static int getKeyElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to find: ");
        return sc.nextInt();
    }

    public static boolean linearSearchIterative(int[] arr , int length, int key){
        for (int i = 0; i < length ; i++) {
            if(arr[i] == key) return true;
        }
        return false;
    }
}
