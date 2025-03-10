package patterns;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            // Print leading spaces
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("  ");
            }
            // Print binomial coefficients
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "   ");
            }
            System.out.println();
        }
    }
    public static int binomialCoefficient(int n, int k) {
        int res = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}
