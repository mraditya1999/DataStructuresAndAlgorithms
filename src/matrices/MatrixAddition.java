package matrices;

public class MatrixAddition {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns() ;

        System.out.println("Enter elements of the first matrix: ");
        int[][] matrix1 = MatrixOperations.readMatrix(noOfRows,noOfRows);
        System.out.println("Enter elements of the second matrix: ");
        int[][] matrix2 = MatrixOperations.readMatrix(noOfRows,noOfRows);

        int[][] sum = addMatrices(matrix1, matrix2, noOfRows, noOfColumns);

        System.out.println("Sum of the matrices is: ");
        MatrixOperations.printMatrix(sum, noOfRows);
    }

    static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
}
