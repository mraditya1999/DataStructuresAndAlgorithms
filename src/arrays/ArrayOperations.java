package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
            int length = 5;
            int[] arr1 = {1,3,5,7,9};

            // Array Methods
            int[] arr2 = arr1.clone();
            int[] arr3 = Arrays.copyOf(arr1,length);
            int[] arr4 = Arrays.copyOfRange(arr1,1,4);

            System.out.print("Array1: ");
            ArrayOperations.printArray(arr1,length);
            System.out.print("Array2: ");
            ArrayOperations.printArray(arr2,length);
            System.out.print("Array3: ");
            ArrayOperations.printArray(arr3,length);
            System.out.print("Array4: ");
            ArrayOperations.printArray(arr4,3);
    }

    public static  int getArrayLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        return sc.nextInt();
    }

    public static int[] initializeArray(int length) {
        return new int[2 * length];
    }

    public static void populateArray(int[] arr, int length) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int length) {
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

    public static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int calculateTotalSum(int[] arr, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static float calculateAverage(int[] arr, int length) {
        int sum = calculateTotalSum(arr, length);
        return (float)sum / length;
    }

    public static boolean searchElement(int[] arr, int length, int key){
        int start = 0;
        int end = length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
