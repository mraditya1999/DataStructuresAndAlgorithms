package patterns;
import java.util.Scanner;

public class ReverseRightPyramidWithAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            char ch = (char) ('E' - i + 1) ;
            for (int j = i; j <= row; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}
