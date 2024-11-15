package matrix;

public class MagicSquare {
    public static void main(String[] args) {
        int[][] arr = {{2, 2, 2,}, {2, 2, 2}, {2, 2, 2}};
        boolean isMagicSquareMatrix = isMagicSquareMatrix(arr);
        System.out.print("Is Magic Square Matrix: " + isMagicSquareMatrix);

    }

    public static boolean isMagicSquareMatrix(int[][] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[0][i];
        }

//        for row sum
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (sum != totalSum) return false;
        }

        //        for column sum
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[j][i];
            }
            if (sum != totalSum) return false;
        }

        //        for diagonal sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) sum += arr[i][j];
            }
        }
        if (sum != totalSum) return false;

        //        for reverse diagonal sum
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][arr.length - i - 1];
            }
            if (sum != totalSum) return false;
        }
        return true;
    }
}
