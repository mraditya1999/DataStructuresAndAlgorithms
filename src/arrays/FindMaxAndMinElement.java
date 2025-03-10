package arrays;

public class FindMaxAndMinElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr,length);

        int maxValue = findMaxValue(arr, length);
        int minValue = findMinValue(arr, length);
        System.out.println("Max element is: " + maxValue);
        System.out.println("Min element is: " + minValue);
    }

    static int findMaxValue(int[] arr, int length) {
        int maxValue = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] > maxValue) maxValue = arr[i];
        }
        return maxValue;
    }

    static int findMinValue(int[] arr,int length) {
        int minValue = arr[0];
        for (int i = 0; i < length ; i++) {
            if (arr[i] < minValue) minValue = arr[i];
        }
        return minValue;
    }
}
