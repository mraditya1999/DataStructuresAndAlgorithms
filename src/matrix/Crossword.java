package matrix;

public class Crossword {
    public static void main(String[] args) {

//        String veticalString = "INDIA";
//        int row = 3;
//        int col = 5;
//
//        String horizontalString = "GOA";
        String veticalString = "CAT";
        int row = 1;
        int col = 2;

        String horizontalString = "BALL";
        char[][] crossword = createCrossword(veticalString, row, col, horizontalString);
        displayCrossword(crossword);
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

//        Find intersection index
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
        for (int j = 0; j < horizontalString.length(); j++) {
            crossword[row][col - intersectionIndex + j] = horizontalString.charAt(j);
        }

        return crossword;
    }

    public static void displayCrossword(char[][] crossword) {
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword.length; j++) {
                System.out.print(crossword[i][j] + " ");
            }
            System.out.println();
        }
    }
}
