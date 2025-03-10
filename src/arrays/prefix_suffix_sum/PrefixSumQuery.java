package arrays.prefix_suffix_sum;
import arrays.ArrayOperations;
import java.util.Scanner;

// Given an array of integers size n. Answer q queries where you need to print the sum of values in a given range of indices form left to right(both included).
// NOTE: the value of left and right in queries follow 1-based indexing.
public class PrefixSumQuery {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();
        int[] arr = ArrayOperations.initializeArray(length);

        System.out.println("Enter first element 0 because of 1-based indexing");
        System.out.print("Enter " + length + " elements: ");
        ArrayOperations.populateArray(arr, length);

        int totalNoOfQueries = getTotalNoOfQueries();
        int prefix_sum = CalculatePrefixSumQuery(arr, length, totalNoOfQueries);
        System.out.println("Sum is: " + prefix_sum);
    }

    static int getTotalNoOfQueries(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of queries you want to run: ");
        return sc.nextInt();
    }

    static int CalculatePrefixSumQuery(int[] arr, int length, int totalNoOfQueries) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int[] prefix_sum =  PrefixSum.calculatePrefixSumMethod3(arr,length);

        // 1-based indexing
        while (totalNoOfQueries > 0) {
            System.out.print("Enter range: ");
            int left = sc.nextInt();
            int right = sc.nextInt();

            ans = prefix_sum[right] - prefix_sum[left - 1];
            totalNoOfQueries--;
        }
    return ans;
    }
}
