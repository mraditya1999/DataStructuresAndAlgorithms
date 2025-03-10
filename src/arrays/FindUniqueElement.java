package arrays;
import java.util.Scanner;

public class FindUniqueElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        int uniqueElement = findUniqueElement(arr, length);
        System.out.println("Unique element is: " + uniqueElement);
    }

    // Find the unique number in the given array where all the elements are repeated twice except for one unique value.
    static int findUniqueElement(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return -1; // Return -1 if no unique element is found
    }
}
