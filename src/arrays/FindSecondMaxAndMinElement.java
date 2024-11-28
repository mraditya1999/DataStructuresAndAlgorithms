package arrays;

import java.util.Arrays;

public class FindSecondMaxAndMinElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        int secondMinElement1 = findSecondMinElementMethod1(arr, length);
        int secondMinElement2 = findSecondMinElementMethod2(arr, length);
        int secondMaxElement1 = findSecondMaxElementMethod1(arr, length);
        int secondMaxElement2 = findSecondMaxElementMethod2(arr, length);

        System.out.println("Second Min Element: " + secondMinElement1);
        System.out.println("Second Min Element: " + secondMinElement2);
        System.out.println("Second Max Element: " + secondMaxElement1);
        System.out.println("Second Max Element: " + secondMaxElement2);
    }


    public static int findSecondMinElementMethod1(int[] arr, int length) {
        int minElement = Integer.MAX_VALUE;
        int secondMinElement = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            if (arr[i] < minElement) {
                secondMinElement = minElement;
                minElement = arr[i];
            } else if (arr[i] < secondMinElement && arr[i] != minElement) {
                secondMinElement = arr[i];
            }
        }
        return secondMinElement;
    }

    public static int findSecondMinElementMethod2(int[] arr, int length) {
        Arrays.sort(arr, 0, length);
        return arr[1];
    }

    public static int findSecondMaxElementMethod1(int[] arr, int length) {
        int maxElement = Integer.MIN_VALUE;
        int secondMaxElement = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            if (arr[i] > maxElement) {
                secondMaxElement = maxElement;
                maxElement = arr[i];
            } else if (arr[i] > secondMaxElement && arr[i] != maxElement) {
                secondMaxElement = arr[i];
            }
        }
        return secondMaxElement;
    }

    public static int findSecondMaxElementMethod2(int[] arr, int length) {
        Arrays.sort(arr, 0, length);
        return arr[length - 2];
    }
}

