package matrix;

public class ReverseEachRow {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns();
        int[][] matrix = MatrixOperations.readMatrix(noOfRows, noOfColumns);

        int[][] reversedMatrix = reverseMatrix(matrix, noOfRows, noOfColumns);
        MatrixOperations.printMatrix(reversedMatrix, noOfRows);
    }

    public static int[][] reverseMatrix(int[][] matrix, int noOfRows, int noOfColumns) {
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][noOfColumns - j - 1];
                matrix[i][noOfColumns - j - 1] = temp;
            }
        }
        return matrix;
    }
}
