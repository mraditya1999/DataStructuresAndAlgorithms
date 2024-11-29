package arrays.two_pointers;

import arrays.ArrayOperations;

public class ZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 0};

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, arr.length);

//        zeroesAndOnesMethod1(arr);
//        zeroesAndOnesMethod2(arr);
        zeroesAndOnesMethod3(arr);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, arr.length);
    }

    public static void zeroesAndOnesMethod1(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count++;
        }

        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void zeroesAndOnesMethod2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayOperations.swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    public static void zeroesAndOnesMethod3(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 0) start++;
            if (arr[end] == 1) end--;
            else {
                ArrayOperations.swap(arr, start, end);
                start++;
                end--;
            }
        }
    }
}
