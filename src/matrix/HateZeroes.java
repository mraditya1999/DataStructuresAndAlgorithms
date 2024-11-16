package matrix;

public class HateZeroes {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 2, 2}, {1, 0, 3, 4}, {0, 0, 0, 0}, {5, 0, 6, 7}};
        int cnt = 0;

        System.out.println("Before: ");
        display(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) cnt++;
            }
            break;
        }

        int[][] newArr = new int[cnt][cnt];

        for (int i = 0, m = 0; i < arr.length; i++) {
            for (int j = 0, n = 0; j < arr.length; j++) {
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
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
