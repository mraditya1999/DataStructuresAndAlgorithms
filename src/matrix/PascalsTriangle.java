package matrix;

public class PascalsTriangle {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int[][] jaggedArray = JaggedArray.initializeJaggedArray(5);

        generatePascalsTriangle(jaggedArray, noOfRows);
        MatrixOperations.printMatrix(jaggedArray, noOfRows);
    }

    public static void generatePascalsTriangle(int[][] jaggedArray, int noOfRows) {
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                if (j == 0 || j == jaggedArray[i].length - 1) {
                    jaggedArray[i][j] = 1;
                } else {
                    jaggedArray[i][j] = jaggedArray[i - 1][j] + jaggedArray[i - 1][j - 1];
                }
            }
        }
    }
}
