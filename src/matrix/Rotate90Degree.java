package matrix;

public class Rotate90Degree {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns();
        int[][] matrix = MatrixOperations.readMatrix(noOfRows, noOfColumns);

        System.out.println("Before: ");
        MatrixOperations.printMatrix(matrix, noOfRows);

        int[][] transposeMatrix = TransposeOfMatrix.transposeOfMatrixMethod2(matrix, noOfRows, noOfColumns);
        int[][] reversedMatrix = ReverseEachRow.reverseEachRowMatrix(matrix, noOfRows, noOfColumns);

        System.out.println("After: ");
        MatrixOperations.printMatrix(matrix, noOfRows);
    }
}
