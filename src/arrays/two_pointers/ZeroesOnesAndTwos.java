package arrays.two_pointers;

import arrays.ArrayOperations;

public class ZeroesOnesAndTwos {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 0, 2, 2, 1, 0};

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, arr.length);

//        zeroesOnesAndTwosMethod1(arr);
//        zeroesOnesAndTwosMethod2(arr);
        zeroesOnesAndTwosMethod3(arr);

        System.out.print("After: ");
        ArrayOperations.printArray(arr, arr.length);
    }

    public static void zeroesOnesAndTwosMethod1(int[] arr) {
        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countZero++;
            else if (arr[i] == 1) countOne++;
        }

        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }
        for (int i = countZero; i < countZero + countOne; i++) {
            arr[i] = 1;
        }

        for (int i = countZero + countOne; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    public static void zeroesOnesAndTwosMethod2(int[] arr) {
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

    public static void zeroesOnesAndTwosMethod3(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (mid <= end) {
            if (arr[mid] == 0) {
                ArrayOperations.swap(arr, start, mid);
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                ArrayOperations.swap(arr, mid, end);
                end--;
            }
        }
    }

}
