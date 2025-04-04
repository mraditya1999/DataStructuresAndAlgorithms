package patterns;
import java.util.Scanner;

public class LeftHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = i; j < row; j++)
                System.out.print("  ");
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
