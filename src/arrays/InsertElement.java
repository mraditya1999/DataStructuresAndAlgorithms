package arrays;
import java.util.Scanner;

public class InsertElement {

    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " values: ");
        ArrayOperations.populateArray(arr, length);

        int value = getElementToInsert();
        int index = getInsertionIndex();

        insertElement(arr, value, index, length);
        length++;
        ArrayOperations.printArray(arr, length);
    }

    static int getElementToInsert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value you want to insert: ");
        return sc.nextInt();
    }

    static int getInsertionIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index at which you want to insert: ");
        return sc.nextInt();
    }

    static void insertElement(int[] arr, int value, int index, int length) {
        for (int i = length; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }
}
