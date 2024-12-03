package matrix;

public class AdditionOfTwoMatrices {
    public static void main(String[] args) {
        int noOfRows1 = MatrixOperations.getNoOfRows();
        int noOfColumns1 = MatrixOperations.getNoOfColumns();
        int[][] matrix1 = MatrixOperations.readMatrix(noOfRows1, noOfColumns1);


        int noOfRows2 = MatrixOperations.getNoOfRows();
        int noOfColumns2 = MatrixOperations.getNoOfColumns();
        int[][] matrix2 = MatrixOperations.readMatrix(noOfRows1, noOfColumns1);


        int[][] sum = addTwoMatrices(matrix1, noOfRows1, noOfColumns1, matrix2, noOfRows2, noOfColumns2);
        MatrixOperations.printMatrix(sum, noOfRows1);
    }

    public static int[][] addTwoMatrices(int[][] matrix1, int noOfColumns1, int noOfRows1, int[][] matrix2, int noOfRows2, int noOfColumns2) {
        if (noOfRows1 != noOfRows2 || noOfColumns1 != noOfColumns2) {
            System.out.println("Addition is not possible!");
            return null;
        }

        int[][] sum = new int[noOfRows1][noOfColumns1];

        for (int i = 0; i < noOfRows1; i++) {
            for (int j = 0; j < noOfColumns1; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
}
