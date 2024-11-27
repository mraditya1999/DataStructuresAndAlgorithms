package arrays;

import java.util.Scanner;

public class FindOccurences {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to check it's occurrence: ");
        int key = sc.nextInt();


        int totalNoOfOccurrence = countNoOfOccurrence(arr, length, key);
        int firstOccurringIndex = findFirstOccurrence(arr, length, key);
        int lastOccurringIndex = findLastOccurrence(arr, length, key);

        System.out.println("Total No of Occurrence: " + totalNoOfOccurrence);
        System.out.println("First Occurring Index: " + firstOccurringIndex);
        System.out.println("Last Occurring Index: " + lastOccurringIndex);
    }

    public static int countNoOfOccurrence(int[] arr, int length, int key) {
        int noOfOccurence = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) noOfOccurence++;
        }
        return noOfOccurence;
    }

    public static int findFirstOccurrence(int[] arr, int length, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static int findLastOccurrence(int[] arr, int length, int key) {
        int occurringIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) occurringIndex = i;
        }
        return occurringIndex;
    }
}
