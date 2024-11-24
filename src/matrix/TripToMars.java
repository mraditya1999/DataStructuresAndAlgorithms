package matrix;

import java.util.Scanner;

public class TripToMars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X cordinate [row] :");
        int row = sc.nextInt();
        System.out.println("Enter Y cordinate [Column] :");
        int col = sc.nextInt();
        System.out.println("Enter Dimensions of Plateu [Matrix Size] :");
        int size = sc.nextInt();
        System.out.println("Enter The Places You Want to Move [i.e MM] : ");
        String move = sc.next();
        char arr[][] = new char[size][size];
        System.out.println("Enter The Direction You Want to Move [N,S,E,W] :");
        char direction = sc.next().charAt(0);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == row && j == col) {
                    arr[i][j] = 'R';
                } else {
                    arr[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (direction == 'N' && row - move.length() >= 0) {
                    arr[row][col] = '*';
                    arr[row - move.length()][col] = 'R';
                    x = row - move.length();
                    y = col;
                } else if (direction == 'S' && row + move.length() <= arr.length) {
                    arr[row][col] = '*';
                    arr[row + move.length()][col] = 'R';
                    x = row + move.length();
                    y = col;
                } else if (direction == 'W' && col - move.length() >= 0) {
                    arr[row][col] = '*';
                    arr[row][col - move.length()] = 'R';
                    x = row;
                    y = col - move.length();
                } else if (direction == 'E' && col + move.length() <= arr.length) {
                    arr[row][col] = '*';
                    arr[row][col + move.length()] = 'R';
                    x = row;
                    y = col + move.length();
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(x + " " + y + " " + direction);

    }
}