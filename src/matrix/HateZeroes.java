package matrix;

public class HateZeroes {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 2, 2}, {1, 0, 3, 4}, {0, 0, 0, 0}, {5, 0, 6, 7}, {6, 0, 7, 8}};
        int rowCount = 0;
        int colCount = 0;

        System.out.println("Before: ");
        display(arr);
//
        for (int i = 0; i < arr.length; i++) {
            colCount = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) colCount++;
            }
            if (arr[i][0] != 0) {
                rowCount++;
            }
        }

        System.out.println("Row: " + rowCount);
        System.out.println("Col: " + colCount);
        int[][] newArr = new int[rowCount][colCount];

        for (int i = 0, m = 0; i < arr.length; i++) {
            for (int j = 0, n = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) {
                    newArr[m][n] = arr[i][j];
                    n++;
                }
            }

            if (arr[i][0] != 0) m++;
        }

        System.out.println("After: ");
        display(newArr);
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

