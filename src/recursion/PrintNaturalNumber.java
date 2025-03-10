package recursion;

import java.util.Scanner;

public class PrintNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        printInAscendingOrder(N);
        System.out.println();
        printInDescendingOrder(N);
    }

    static void printInAscendingOrder(int N){
        if(N == 0) return;
        printInAscendingOrder(N - 1);
        System.out.print(N + " ");
    }
    static void printInDescendingOrder(int N){
     if (N == 0) return;
     System.out.print(N + " ");
     printInDescendingOrder(N - 1);
    }
}
