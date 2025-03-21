package patterns;
import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        // upper half
        for (int i = 1; i <= row ; i++) {
          //  1st part
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            
          //  spaces
            int spaces = 2 * (row - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

          //  2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //  lower half
        for (int i = row; i >= 1 ; i--) {
            //  1st part
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }

            //  spaces
            int spaces = 2 * (row - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            //  2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}