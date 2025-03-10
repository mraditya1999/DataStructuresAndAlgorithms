package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr,length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr,length);

        reverseArray(arr, length, 1);
//        reverseArray(arr, length, 2);
//        reverseArray(arr, length, 3);

        System.out.print("After: ");
        ArrayOperations.printArray(arr,length);
    }

    static void reverseArray(int[] arr, int length, int method) {
        switch (method) {
            case 1:
                reverseArrayMethod1(arr, length);
                break;
            case 2:
                reverseArrayMethod2(arr, length);
                break;
            case 3:
                reverseArrayMethod3(arr, length);
                break;
            default:
                throw new IllegalArgumentException("Invalid method choice.");
        }
    }

    // Method 1: Using two pointers
    static void reverseArrayMethod1(int[] arr, int length) {
        int leftIndex = 0;
        int rightIndex = length - 1;

        while (leftIndex < rightIndex) {
            ArrayOperations.swap(arr,leftIndex,rightIndex);
            leftIndex++;
            rightIndex--;
        }
    }

    // Method 2: Using a single loop
    static void reverseArrayMethod2(int[] arr, int length) {
        for (int i = 0; i < length / 2; i++) {
            ArrayOperations.swap(arr,i , length - 1 - i);
        }
    }

    // Method 3: Using an auxiliary array
    static void reverseArrayMethod3(int[] arr, int length) {
        int[] reversedArray = new int[length];

        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        System.arraycopy(reversedArray, 0, arr, 0, length);
    }
}
