package patterns;

import java.util.Scanner;

public class PyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }

            System.out.println();
        }

    }
}
