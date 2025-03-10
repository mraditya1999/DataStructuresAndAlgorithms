package patterns;
import java.util.Scanner;

public class ConcentricRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) { // Loop from 0 to row-1
            for (int j = 0; j < row; j++) { // Loop from 0 to row-1
                int value = Math.max(Math.max(i, j), Math.max(row - 1 - i, row - 1 - j)) + 1; // decreasing
//                int value = Math.min(Math.min(i, j), Math.min(row - 1 - i, row - 1 - j)) + 1; // increasing
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
