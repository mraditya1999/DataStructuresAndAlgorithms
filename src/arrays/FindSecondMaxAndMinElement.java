package arrays;

public class FindSecondMaxAndMinElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " values: ");
        ArrayOperations.populateArray(arr,length);

        int secondMaxValue = findSecondMaxValue(arr,length);
        int secondMinValue = findSecondMinValue(arr, length);

        System.out.println("Second Max element is: " + secondMaxValue);
        System.out.println("Second Min element is: " + secondMinValue);
    }

    static int findSecondMaxValue(int[] arr,int length) {
        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < length ; i++) {
            int element = arr[i];
            if (element > maxValue) {
                secondMaxValue = maxValue;
                maxValue = element;
            }else if (element > secondMaxValue && element < maxValue) {
                secondMaxValue = element;
            }
        }
        return secondMaxValue;
    }

    static int findSecondMinValue(int[] arr, int length) {
        int minValue = Integer.MAX_VALUE;
        int secondMinValue = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            int element = arr[i];
            if (element < minValue) {
                secondMinValue = minValue;
                minValue = element;
            } else if (element > minValue && element < secondMinValue) {
                secondMinValue = element;
            }
        }
        return secondMinValue;
    }
}
