package arrays;

import java.util.Scanner;

public class PresentQuery {

    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 400, 560, 1000, 400};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of queries: ");
        int numOfQueries = sc.nextInt();

        System.out.println("1.Method1\t2.Method2");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                executeQueryMethod1(arr, numOfQueries);
                break;
            case 2:
                executeQueryMethod2(arr, numOfQueries);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static void executeQueryMethod1(int[] arr, int queries) {
        Scanner sc = new Scanner(System.in);

        while (queries > 0) {
            System.out.print("Enter key: ");
            int key = sc.nextInt();

            if (isPresent(arr, key)) {
                System.out.println(key + " is present");
            } else {
                System.out.println(key + " is not present");
            }
            queries--;
        }
    }

    public static void executeQueryMethod2(int[] arr, int queries) {
        int[] frequencyArr = buildFrequencyArray(arr);

        Scanner sc = new Scanner(System.in);

        while (queries > 0) {
            System.out.print("Enter key: ");
            int key = sc.nextInt();

            if (key >= 0 && key < frequencyArr.length) {
                if (frequencyArr[key] == 0) {
                    System.out.println(key + " is not present");
                } else {
                    System.out.println(key + " is present");
                }
            } else {
                System.out.println("Key out of range.");
            }
            queries--;
        }
    }

    public static int[] buildFrequencyArray(int[] arr) {
        int maxValue = 100000; // Given constraint
        int[] frequencyArr = new int[maxValue];

        for (int value : arr) {
            if (value >= 0 && value < maxValue) {
                frequencyArr[value]++;
            }
        }
        return frequencyArr;
    }

    public static boolean isPresent(int[] arr, int key) {
        for (int value : arr) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }
}
