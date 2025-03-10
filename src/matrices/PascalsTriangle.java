package matrices;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int noOfRows = sc.nextInt();

        int[][]ans = pascalTriangle(noOfRows);
        MatrixOperations.printMatrix(ans,noOfRows);
    }

    static int[][] pascalTriangle(int noOfRows){
        int[][] ans = new int[5][];

        for (int i = 0; i < noOfRows ; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = 1;
            ans[i][i] = 1;
            for (int j = 1; j < i ; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
}
