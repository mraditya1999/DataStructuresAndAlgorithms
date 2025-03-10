
package matrices;
import java.util.Scanner;

public class PrefixSumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns();

        int[][] matrix = MatrixOperations.readMatrix(noOfRows, noOfColumns);

        System.out.println("Enter rectangle boundaries row1, col1, row2, col2 ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        int sum1 = findSumMethod1(matrix, row1, col1, row2, col2);
        System.out.println("Rectangle Sum using method 1 is: " + sum1);

        int sum2 = findSumMethod2(matrix, row1, col1, row2, col2);
        System.out.println("Rectangle Sum using method 2 is: " + sum2);
    }

    static int findSumMethod1(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    static int findSumMethod2(int[][] matrix, int r1, int c1, int r2, int c2) {
        int[][] prefixSumMatrix = findPrefixSum(matrix);
        int sum = prefixSumMatrix[r2][c2];

        if (r1 > 0) sum -= prefixSumMatrix[r1 - 1][c2];
        if (c1 > 0) sum -= prefixSumMatrix[r2][c1 - 1];
        if (r1 > 0 && c1 > 0) sum += prefixSumMatrix[r1 - 1][c1 - 1];

        return sum;
    }

    static int[][] findPrefixSum(int[][] matrix) {
        int noOfRows = matrix.length;
        int noOfColumns = matrix[0].length;
        int[][] prefixSumMatrix = new int[noOfRows][noOfColumns];

        prefixSumMatrix[0][0] = matrix[0][0];

        for (int j = 1; j < noOfColumns; j++) {
            prefixSumMatrix[0][j] = prefixSumMatrix[0][j - 1] + matrix[0][j];
        }

        for (int i = 1; i < noOfRows; i++) {
            prefixSumMatrix[i][0] = prefixSumMatrix[i - 1][0] + matrix[i][0];
        }

        for (int i = 1; i < noOfRows; i++) {
            for (int j = 1; j < noOfColumns; j++) {
                prefixSumMatrix[i][j] = matrix[i][j] + prefixSumMatrix[i - 1][j] + prefixSumMatrix[i][j - 1] - prefixSumMatrix[i - 1][j - 1];
            }
        }

        return prefixSumMatrix;
    }
}
