package matrices;

import arrays.ArrayOperations;

public class MatrixTranspose {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns() ;

        System.out.println("Enter elements of the matrix: ");
        int[][] matrix = MatrixOperations.readMatrix(noOfRows,noOfColumns);

        int[][] transposeMatrix = getTransposeOfMatrixMethod1(matrix , noOfRows, noOfColumns);
        System.out.println("Transpose of the matrix is: ");
        MatrixOperations.printMatrix(transposeMatrix, noOfRows);


        getTransposeOfMatrixMethod2(matrix , noOfRows, noOfColumns);
        System.out.println("Transpose of the matrix in-place is: ");
        MatrixOperations.printMatrix(matrix, noOfRows);
    }

    static int[][] getTransposeOfMatrixMethod1(int[][] matrix, int row, int col){
        int[][] transposeMatrix = new int[col][row];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                    transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    // can be used with same rows and same columns
    static void getTransposeOfMatrixMethod2(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }




}
