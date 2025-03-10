package patterns;
import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        // upper half
        for (int i = 1; i <= row ; i++) {
            // spaces
            for (int j = i; j < row ; j++) {
                System.out.print(" ");
            }

            // pattern
            for (int j = 1; j <= i ; j++) {
                if (i == 1 || j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // lower half
        for (int i = 1; i <= row ; i++) {
            // spaces
            for (int j = 1; j < i ; j++) {
                    System.out.print(" ");
            }

            // pattern
            for (int j = i; j <= row ; j++) {
                if (j == 1 || i == j || j == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
    }
}
