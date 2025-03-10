package patterns;

import java.util.Scanner;

public class HollowReverseTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row ; i++) {
            // spaces
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }

            // pattern
            for (int j = i; j <= row ; j++) {
                if(j == 1  || j == i || i == 1 || j == row){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
