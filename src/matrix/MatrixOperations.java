package matrix;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        int noOfRows = getNoOfRows();
        int noOfColumns = getNoOfColumns();

        int[][] matrix = readMatrix(noOfRows, noOfColumns);
        printMatrix(matrix, noOfRows);
    }

    static int getNoOfRows() {
        System.out.print("Enter no. of rows for the matrices: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int getNoOfColumns() {
        System.out.print("Enter no. of columns for the matrices: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int[][] readMatrix(int rows, int columns) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter " + (i + 1) + " row: ");
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
