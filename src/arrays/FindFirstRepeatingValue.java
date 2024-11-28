package arrays;

public class FindFirstRepeatingValue {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        int ans = findFirstRepeatingValue(arr, length);
        System.out.println("First repeating value is: " + ans);
    }

    public static int findFirstRepeatingValue(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }
}
