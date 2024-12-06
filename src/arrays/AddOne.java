package arrays;

public class AddOne {
    public static void main(String[] args) {
        int length = ArrayOperations.getArrayLength();

        int[] arr = ArrayOperations.initializeArray(length);

        System.out.print("Enter " + length + " Elements: ");
        ArrayOperations.populateArray(arr, length);

        System.out.print("Before: ");
        ArrayOperations.printArray(arr, length);


//        int[] ans = addOneMethod1(arr, length);
        int[] ans = addOneMethod2(arr, length);

        if (arr.length == ans.length) {
            System.out.print("After: ");
            ArrayOperations.printArray(ans, length);
        } else {
            System.out.print("After: ");
            ArrayOperations.printArray(ans, ans.length);
        }
    }

    public static int[] addOneMethod1(int[] arr, int length) {
        int carry = 1;
        for (int i = length - 1; i >= 0; i--) {
            arr[i] = arr[i] + carry;
            if (arr[i] > 9) {
                carry = 1;
                arr[i] = arr[i] % 10;
            } else {
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            int[] ans = new int[length + 1];
            ans[0] = carry;
            for (int i = 0; i < length; i++) {
                ans[i + 1] = arr[i];
            }
            return ans;
        } else {
            return arr;
        }
    }

    public static int[] addOneMethod2(int[] arr, int length) {

        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            } else {
                arr[i] = 0;
            }
        }

        int[] ans = new int[length + 1];
        ans[0] = 1;
        return ans;
    }
}
