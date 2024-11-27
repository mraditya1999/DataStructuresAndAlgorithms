package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);

//        reverseArrayMethod1(arr, length);
//        reverseArrayMethod2(arr, length);
        reverseArrayMethod3(arr, length);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, length);
    }

    public static void reverseArrayMethod1(int[] arr, int length) {
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
    }

    public static void reverseArrayMethod2(int[] arr, int length) {
        int start = 0;
        int end = length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverseArrayMethod3(int[] arr, int length) {
        int[] arr2 = new int[length];

        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }

        for (int i = 0; i < length; i++) {
            arr[i] = arr2[i];
        }
    }
}
