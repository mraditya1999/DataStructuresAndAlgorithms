package matrix;

public class MultiplicationOfTwoMatrices {
    public static void main(String[] args) {
        int noOfRows1 = MatrixOperations.getNoOfRows();
        int noOfColumns1 = MatrixOperations.getNoOfColumns();
        int[][] matrix1 = MatrixOperations.readMatrix(noOfRows1, noOfColumns1);


        int noOfRows2 = MatrixOperations.getNoOfRows();
        int noOfColumns2 = MatrixOperations.getNoOfColumns();
        int[][] matrix2 = MatrixOperations.readMatrix(noOfRows1, noOfColumns1);


        int[][] result = multiplyTwoMatrices(matrix1, noOfRows1, noOfColumns1, matrix2, noOfRows2, noOfColumns2);
        MatrixOperations.printMatrix(result, noOfRows1);
    }

    //    no of columns of 1st matrix should be equal to no of rows of 2nd matrix  (C1 X R1)
//    the multiplication answer will be of  no of rows of 1st matrix and no of columns of 2nd matrix (R1 * C1)
    public static int[][] multiplyTwoMatrices(int[][] matrix1, int noOfRows1, int noOfColumns1, int[][] matrix2, int noOfRows2, int noOfColumns2) {
        if (noOfColumns1 != noOfRows2) {
            System.out.println("Multiplication is not possible!");
            return null;
        }

        int[][] result = new int[noOfRows1][noOfColumns2];

        for (int i = 0; i < noOfRows1; i++) {
            for (int j = 0; j < noOfColumns2; j++) {
                int sum = 0;
                for (int k = 0; k < noOfColumns1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}
