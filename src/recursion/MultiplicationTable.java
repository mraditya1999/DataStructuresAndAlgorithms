package recursion;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        printMultiplicationTable(N, 1);
    }

    public static void printMultiplicationTable(int N, int i) {
        if (i > 10) return;
        System.out.println(N + " * " + i + " = " + N * i);
        printMultiplicationTable(N, i + 1);
    }
}
