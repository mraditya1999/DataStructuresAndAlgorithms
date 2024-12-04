package matrix;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int[][] jaggedArray = initializeJaggedArray(5);
        populateJaggedArray(jaggedArray, noOfRows);
        MatrixOperations.printMatrix(jaggedArray, noOfRows);
    }

    public static int[][] initializeJaggedArray(int noOfRows) {
        int[][] jaggedArray = new int[noOfRows][];

        for (int i = 0; i < noOfRows; i++) {
            jaggedArray[i] = new int[i + 1];
        }
        return jaggedArray;
    }

    public static void populateJaggedArray(int[][] jaggedArray, int noOfRows) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print("Enter element for row " + i + ", column " + j + ": ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }
    }
}
