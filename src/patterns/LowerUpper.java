package patterns;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        char ch = 'a';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j - 1;
                if (sum % 2 == 0) { // even
                    System.out.print(ch + " ");
                } else { // odd
                    System.out.print((char) (ch - 32) + " ");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
