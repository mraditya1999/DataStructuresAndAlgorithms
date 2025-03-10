package matrices;

public class MatrixMultiplication {
    public static void main(String[] args) {
        //  the number of columns in the first matrix should be equal to the number of rows in the second.
        int noOfRows1 = MatrixOperations.getNoOfRows();
        int noOfColumns1 = MatrixOperations.getNoOfColumns() ;

        int noOfRows2 = MatrixOperations.getNoOfRows();
        int noOfColumns2 = MatrixOperations.getNoOfColumns() ;

        if(noOfColumns1 != noOfRows2 ){
            System.out.println("No. of rows of 1 matrix must be equal to no. of columns of second matrix");
            return;
        }

        System.out.println("Enter " + noOfColumns1  +  " elements of first matrix: ");
        int[][] matrix1 = MatrixOperations.readMatrix(noOfRows1,noOfColumns1);

        System.out.println("Enter " + noOfRows2 * noOfColumns2  +  " elements of second matrix: ");
        int[][] matrix2 = MatrixOperations.readMatrix(noOfRows2,noOfColumns2);

        int[][] product = multiplyMatrices(matrix1, noOfRows1, noOfColumns1,matrix2,noOfRows2,noOfColumns2);

        System.out.println("Product of the matrices is: ");
        MatrixOperations.printMatrix(product, noOfRows1);
    }

    static int[][] multiplyMatrices(int[][] matrix1, int noOfRows1, int noOfColumns1, int[][] matrix2, int noOfRows2, int noOfColumns2) {
        int[][] product = new int[noOfRows1][noOfColumns2];
        int sum = 0;

        for (int i = 0; i < noOfRows1; i++) {
            for (int j = 0; j < noOfColumns2; j++) {
                for (int k = 0; k < noOfColumns1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
}
