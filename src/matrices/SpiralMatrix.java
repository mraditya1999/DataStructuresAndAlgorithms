//54. Spiral Matrix - Given an m x n matrix, return all elements of the matrix in spiral order.
//59. Spiral Matrix II - Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
package matrices;

public class SpiralMatrix {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns();

        int[][] ans = generateSpiralOrderMatrix(noOfRows, noOfColumns);
        printSpiralOrderMatrix(ans, noOfRows, noOfColumns);
        MatrixOperations.printMatrix(ans, noOfRows);
    }

    static void printSpiralOrderMatrix(int[][] matrix, int noOfRows, int noOfColumns) {
        int totalNoOfElements = noOfRows * noOfColumns;
        int count = 1;

        int topRow = 0;
        int bottomRow = noOfRows - 1;
        int leftCol = 0;
        int rightCol = noOfColumns - 1;

        while (count <= totalNoOfElements) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && count <= totalNoOfElements; j++) {
                System.out.print(matrix[topRow][j] + " ");
                count++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && count <= totalNoOfElements; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                count++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && count <= totalNoOfElements; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                count++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && count <= totalNoOfElements; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                count++;
            }
            leftCol++;
        }
        System.out.println();
    }

    static int[][] generateSpiralOrderMatrix(int noOfRows, int noOfColumns) {
        int[][] matrix = new int[noOfRows][noOfColumns];
        int totalNoOfElements = noOfRows * noOfColumns;
        int count = 0;

        int leftCol = 0;
        int rightCol = noOfColumns - 1;
        int topRow = 0;
        int bottomRow = noOfRows - 1;

        while (count < totalNoOfElements) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && count < totalNoOfElements; j++) {
                matrix[topRow][j] = ++count;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && count < totalNoOfElements; i++) {
                matrix[i][rightCol] = ++count;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && count < totalNoOfElements; j--) {
                matrix[bottomRow][j] = ++count;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && count < totalNoOfElements; i--) {
                matrix[i][leftCol] = ++count;
            }
            leftCol++;
        }

        return matrix;
    }
}
