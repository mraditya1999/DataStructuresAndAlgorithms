package patterns;
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        // upper half
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i ; j++) {
                    System.out.print("  ");
            }

            // pattern
            for (int j = 1; j <= 2 * i - 1 ; j++) {
                    System.out.print("* ");
            }
                System.out.println();
        }

        // lower half
        for (int i = row; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= row - i ; j++) {
                System.out.print("  ");
            }

            // pattern
            for (int j = 1; j <= 2 * i - 1 ; j++) {
                System.out.print("* ");
            }
                System.out.println();
        }
    }
}
