package arrays;

import java.util.Scanner;

public class ElementOccurrence {
    public static void main(String[] args) {
//        int[] arr = {1,2,1,2,1,2,3,3,3,4,1};
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " values: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Enter a number to check its occurrence: ");
        int N = getElement();

        int firstOccurrenceIndex = findFirstOccurrence(arr, length, N);
        System.out.println("First occurrence of " + N + " is at index: " + firstOccurrenceIndex);

        int lastOccurrenceIndex = findLastOccurrence(arr, length, N);
        System.out.println("Last occurrence of " + N + " is at index: " + lastOccurrenceIndex);

        int totalNoOfOccurrence = findTotalNoOfOccurrences(arr, length, N);
        System.out.println("Total no of occurrence of " + N + " is: " + totalNoOfOccurrence);

        int newLength = removeAllOccurrences(arr, length, N);
        System.out.print("After remove all occurrences of " + N + " elements are: ");
        ArrayOperations.printArray(arr, newLength );
    }

    static int getElement(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int findFirstOccurrence(int[] arr, int length, int n){
        int firstOccurrenceIndex = -1;
        for (int i = 0; i < length ; i++) {
            if(arr[i] == n) {
                firstOccurrenceIndex = i;
                break;
            }
        }
        return firstOccurrenceIndex;
    }

    static int findLastOccurrence(int[] arr, int length, int n){
        int lastOccurrenceIndex = -1;
        for (int i = 0; i < length ; i++) {
            if(arr[i] == n) lastOccurrenceIndex = i;
        }
        return lastOccurrenceIndex;
    }

    static int findTotalNoOfOccurrences(int[] arr,int length, int n){
        int noOfOccurence = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == n) noOfOccurence++;
        }
        return noOfOccurence;
    }

    static int removeAllOccurrences(int[] arr,int length, int val){
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
