package arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr,length);

        //   remove element
        int element = getDeletionElement();
        removeElement(arr, element, length);
        length--;
        ArrayOperations.printArray(arr,length);

        //   remove element at given index
        int index = getDeletionIndex();
        removeElementAtGivenIndex(arr, index, length);
        length--;
        ArrayOperations.printArray(arr,length);
    }

    static int getDeletionElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element you want to delete: ");
        return sc.nextInt();
    }

    static int getDeletionIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index at which you want to delete: ");
        return sc.nextInt();
    }

    static void removeElement(int[] arr,int element, int length) {
        int elementIndex = 0;

        for (int i = 0; i < length; i++) {
            if(arr[i] == element)elementIndex = i;
        }

        for (int i = elementIndex; i < length - 1 ; i++) {
            arr[i] = arr[i+1];
        }
    }

    static void removeElementAtGivenIndex(int[] arr,int index,int length) {
        for (int i = index; i < length - 1; i++) {
            arr[i] = arr[i+1];
        }
    }
}
