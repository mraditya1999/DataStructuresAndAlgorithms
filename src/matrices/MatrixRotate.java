package matrices;

public class MatrixRotate {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns() ;

        if(noOfRows != noOfColumns){
            System.out.println("No. of rows and No. of columns must be same");
            return;
        }

        System.out.println("Enter elements of the matrix: ");
        int[][] matrix = MatrixOperations.readMatrix(noOfRows,noOfColumns);


        rotateMatrixBy90degree(matrix , noOfRows, noOfColumns);
        System.out.println("Transpose of the matrix in-place is: ");
        MatrixOperations.printMatrix(matrix, noOfRows);
    }

    static void rotateMatrixBy90degree(int[][] matrix, int rows, int columns){
        MatrixTranspose.getTransposeOfMatrixMethod2(matrix,rows,columns);
        ReverseRowsInMatrix.reverseRowsInMatrix(matrix,rows,columns);
    }
}
