package matrices;

import arrays.ArrayOperations;

public class ReverseRowsInMatrix {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns();

        System.out.println("Enter elements of the matrix: ");
        int[][] matrix = MatrixOperations.readMatrix(noOfRows, noOfColumns);

        reverseRowsInMatrix(matrix, noOfRows, noOfColumns);

        System.out.println("Reverse row of the matrix is: ");
        MatrixOperations.printMatrix(matrix, noOfRows);
    }

    static void reverseRowsInMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            ArrayOperations.reverseArray(matrix[i],row) ;
        }
    }

}


