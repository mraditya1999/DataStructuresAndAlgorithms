package matrix;

import java.util.Scanner;

public class Crossword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the vertical string:");
        String verticalString = scanner.nextLine();

        System.out.println("Enter the row index for the vertical string:");
        int row = scanner.nextInt();

        System.out.println("Enter the column index for the vertical string:");
        int col = scanner.nextInt();

        System.out.println("Enter the horizontal string:");
        scanner.nextLine(); // consume the newline character
        String horizontalString = scanner.nextLine();

        char[][] crossword = createCrossword(verticalString, row, col, horizontalString);
        displayCrossword(crossword);

        scanner.close();
    }

    public static char[][] createCrossword(String verticalString, int row, int col, String horizontalString) {
        char[][] crossword = new char[10][10];

        // Initialize crossword grid with '*'
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[i].length; j++) {
                crossword[i][j] = '*';
            }
        }

        // Place vertical string
        for (int i = 0; i < verticalString.length(); i++) {
            crossword[row + i][col] = verticalString.charAt(i);
        }

        // Find intersection index
        int intersectionIndex = -1;
        for (int i = 0; i < verticalString.length(); i++) {
            for (int j = 0; j < horizontalString.length(); j++) {
                if (verticalString.charAt(i) == horizontalString.charAt(j)) {
                    intersectionIndex = j;
                    row = row + i;
                    break;
                }
            }
            if (intersectionIndex != -1) {
                break; // Exit outer loop if intersection is found
            }
        }

        // Place horizontal string
        if (intersectionIndex != -1) {
            for (int j = 0; j < horizontalString.length(); j++) {
                crossword[row][col - intersectionIndex + j] = horizontalString.charAt(j);
            }
        } else {
            System.out.println("No common intersection character found.");
        }

        return crossword;
    }

    public static void displayCrossword(char[][] crossword) {
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[i].length; j++) {
                System.out.print(crossword[i][j] + " ");
            }
            System.out.println();
        }
    }
}
