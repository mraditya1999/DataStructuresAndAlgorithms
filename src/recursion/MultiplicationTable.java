package recursion;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        printMultiplicationTable(N,1);
    }

    static void printMultiplicationTable(int N, int count){
        if(count > 10) return;

        System.out.println(N + " X " + count + " = " + N * count);
        count++;
        printMultiplicationTable(N, count);
    }

}
