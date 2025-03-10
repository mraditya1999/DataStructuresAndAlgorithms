package arrays;
import java.util.Scanner;

public class FindFirstRepeatingValue {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        int uniqueElement = findFirstRepeatingValue(arr, length);
        System.out.println("First repeating element is: " + uniqueElement);
    }

    // Given an array 'a' consisting of integers.
    // Return the first value that is repeating in this array. If no value is being repeated return -1;
    static int findFirstRepeatingValue(int[] arr, int length) {
        for (int i = 0; i < length ; i++) {
            for (int j = i + 1; j < length ; j++) {
                if (arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }
}
