package arrays;

import java.util.Arrays;

public class IsRotated {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 1, 2, 3};
        boolean isRotated = isRotatedRightMethod1(arr1, arr2);
        System.out.println("Is Rotated: " + isRotated);
    }

    public static boolean isRotatedRightMethod1(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        if (length1 != length2) return false;

        int[] temp = Arrays.copyOf(arr2, arr2.length);
        for (int i = 0; i < length2; i++) {
            int firstElement = temp[0];
            for (int j = 0; j < length2 - 1; j++) {
                temp[j] = temp[j + 1];
            }
            temp[length2 - 1] = firstElement;
            if (arr1[0] == temp[0]) {
                for (int j = 0; j < length2; j++) {
                    if (arr1[j] != temp[j]) return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isRotatedRightMethod2(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;

        int length = arr1.length;
        int[] concatenated = new int[length * 2];

        // Concatenate arr2 with itself
        for (int i = 0; i < length; i++) {
            concatenated[i] = arr2[i];
            concatenated[i + length] = arr2[i];
        }

        // Check if arr1 is a sub-array of concatenated array
        for (int i = 0; i < length; i++) {
            boolean isMatch = true;
            for (int j = 0; j < length; j++) {
                if (arr1[j] != concatenated[i + j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) return true;
        }

        return false;
    }

}
