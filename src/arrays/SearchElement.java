package arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr,length);

        int key = getSearchKey();
        int index = -1;

        index = searchElement(arr, key, length);

        if (index != -1) {
            System.out.println(key + " found at index: " + index);
        } else {
            System.out.println(key + " not found.");
        }
    }

    static int getSearchKey() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        return sc.nextInt();
    }

    static int searchElement(int[] arr, int key,int length) {
        for(int i = 0; i < length ; i++) {
            if (arr[i] == key) return i;
        }
            return -1;
    }
}
