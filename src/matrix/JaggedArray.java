package matrix;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        int noOfRows = MatrixOperations.getNoOfRows();
        int[][] jaggedArray = createJaggedArray(noOfRows);
        MatrixOperations.printMatrix(jaggedArray, noOfRows);
    }

    public static int[][] createJaggedArray(int noOfRows) {
        Scanner sc = new Scanner(System.in);
        int[][] jaggedArray = new int[noOfRows][];
        for (int i = 0; i < noOfRows; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print("Enter element for row " + i + ", column " + j + ": ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        return jaggedArray;
    }

}
