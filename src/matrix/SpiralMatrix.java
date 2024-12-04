package matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int noOfColumns = MatrixOperations.getNoOfColumns();

        if (noOfRows != noOfColumns) {
            System.out.println("No of rows must be equal to no of columns!");
            System.exit(1);
        }

        int[][] spiralMatrix = generateSpiralMatrix(noOfRows, noOfColumns);
        MatrixOperations.printMatrix(spiralMatrix, noOfRows);

        System.out.println("Spiral Order: ");
        displaySpiralMatrix(spiralMatrix, noOfRows, noOfColumns);
    }

    public static int[][] generateSpiralMatrix(int noOfRows, int noOfColumns) {
        int[][] spiralMatrix = new int[noOfRows][noOfColumns];
        int count = 1;
        int totalNoOfCount = 0;

        int topRow = 0;
        int bottomRow = noOfRows - 1;
        int leftColumn = 0;
        int rightColumn = noOfColumns - 1;

        while (totalNoOfCount < noOfRows * noOfColumns) {
//            Top Row
            for (int i = leftColumn; i <= rightColumn; i++) {
                spiralMatrix[topRow][i] = count++;
                totalNoOfCount++;
            }
            topRow++;

//          Right Column
            for (int i = topRow; i <= bottomRow; i++) {
                spiralMatrix[i][rightColumn] = count++;
                totalNoOfCount++;
            }
            rightColumn--;

//          Bottom Row
            for (int i = rightColumn; i >= leftColumn; i--) {
                spiralMatrix[bottomRow][i] = count++;
                totalNoOfCount++;
            }
            bottomRow--;

//          Left Column
            for (int i = bottomRow; i >= topRow; i--) {
                spiralMatrix[i][leftColumn] = count++;
                totalNoOfCount++;
            }
            leftColumn++;
        }
        return spiralMatrix;
    }

    public static void displaySpiralMatrix(int[][] matrix, int noOfRows, int noOfColumns) {
        int totalNoOfCount = 0;

        int topRow = 0;
        int bottomRow = noOfRows - 1;
        int leftColumn = 0;
        int rightColumn = noOfColumns - 1;

        while (totalNoOfCount < noOfRows * noOfColumns) {
//            Top Row
            for (int i = leftColumn; i <= rightColumn; i++) {
                System.out.print(matrix[topRow][i] + " ");
                totalNoOfCount++;
            }
            topRow++;

//          Right Column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightColumn] + " ");
                totalNoOfCount++;
            }
            rightColumn--;

//          Bottom Row
            for (int i = rightColumn; i >= leftColumn; i--) {
                System.out.print(matrix[bottomRow][i] + " ");
                totalNoOfCount++;
            }
            bottomRow--;

//          Left Column
            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(matrix[i][leftColumn] + " ");
                totalNoOfCount++;
            }
            leftColumn++;
        }
    }
}
