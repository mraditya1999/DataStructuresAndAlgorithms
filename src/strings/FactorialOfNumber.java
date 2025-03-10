package strings;
public class FactorialOfNumber {
    public static void main(String[] args) {
        int N = 5;
        int[] result = new int[500]; // Array to store the factorial digits
        result[0] = 1; // Initialize the result array with 1
        int resultSize = 1; // Initial size of the result

        for (int num = 2; num <= N; num++) {
            resultSize = multiply(num, result, resultSize);
        }

        // Print the result in the correct order
        for (int i = resultSize - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
        System.out.println();
    }

    private static int multiply(int num, int[] result, int resultSize) {
        int carry = 0;

        for (int i = 0; i < resultSize; i++) {
            int prod = result[i] * num + carry;
            result[i] = prod % 10; // Store last digit of prod in result
            carry = prod / 10; // Put rest in carry
        }

        // Put carry in result and increase the result size
        while (carry != 0) {
            result[resultSize] = carry % 10;
            carry = carry / 10;
            resultSize++;
        }

        return resultSize;
    }
}
