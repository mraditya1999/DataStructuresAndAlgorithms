package arrays;
import java.util.Scanner;

public class PresentQuery {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr =  ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        int[] queries = getQueries();
        checkPresence(arr, queries);
    }

    public static int[] getQueries() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of queries you want to run: ");
        int queries = sc.nextInt();
        int[] queryValue = new int[queries];

        System.out.print("Enter " + queries + " values: ");
        for (int i = 0; i < queries; i++) {
            queryValue[i] = sc.nextInt();
        }
        return queryValue;
    }

     static void checkPresence(int[] arr, int[] queries) {
        boolean[] presenceArray = new boolean[100000];

        markPresence(arr, presenceArray);
        processQueries(queries, presenceArray);
    }

     static void markPresence(int[] arr, boolean[] presenceArray) {
        for (int value : arr) {
            if (value < 100000) {
                presenceArray[value] = true;
            }
        }
    }

    private static void processQueries(int[] queries, boolean[] presenceArray) {
        for (int query : queries) {
            if (query < 100000 && presenceArray[query]) {
                System.out.println(query + " is present in the array.");
            } else {
                System.out.println(query + " is not present in the array.");
            }
        }
    }
}
