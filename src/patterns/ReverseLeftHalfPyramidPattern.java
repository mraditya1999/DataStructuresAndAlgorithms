package patterns;
import java.util.Scanner;

public class ReverseLeftHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("  ");
            for (int k = i; k <= row ; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
