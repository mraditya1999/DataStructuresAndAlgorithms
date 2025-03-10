package arrays;

public class IsSorted {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " values: ");
        ArrayOperations.populateArray(arr, length);

        boolean flag = isSorted(arr, length);
        System.out.print("Is Sorted: " + flag);
    }

    static boolean isSorted(int[] arr, int length){
        for (int i = 0; i < length - 1; i++) {
            int currentElement = arr[i];
            int nextElement = arr[i + 1];
            if(currentElement > nextElement) return false;
        }
        return true;
    }
}
