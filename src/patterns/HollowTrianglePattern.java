package patterns;
import java.util.Scanner;

public class HollowTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row ; i++) {
            // spaces
            for (int j = i; j <= row ; j++) {
                System.out.print(" ");
            }

            // pattern
            for (int k = 1; k <= i ; k++) {
                if(k == 1 || k == i || i == row){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
