package matrix;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns();
        int[][] matrix = MatrixOperations.readMatrix(noOfRows, noOfColumns);

        System.out.println("Before: ");
        MatrixOperations.printMatrix(matrix, noOfRows);

//        int[][] transposeMatrix = transposeOfMatrixMethod1(matrix, noOfRows, noOfColumns);
        int[][] transposeMatrix = transposeOfMatrixMethod2(matrix, noOfRows, noOfColumns);

        System.out.println("After: ");
        MatrixOperations.printMatrix(transposeMatrix, noOfColumns);
    }

    public static int[][] transposeOfMatrixMethod1(int[][] matrix, int noOfRows, int noOfColumns) {
        int[][] transposeMatrix = new int[noOfColumns][noOfRows];

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }


    public static int[][] transposeOfMatrixMethod2(int[][] matrix, int noOfRows, int noOfColumns) {
        if (noOfRows != noOfColumns) {
            System.out.println("No of Rows and Columns must be equal");
            System.exit(1);
        }
        for (int i = 0; i < noOfRows; i++) {
            for (int j = i; j < noOfColumns; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
