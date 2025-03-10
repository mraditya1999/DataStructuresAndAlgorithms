package recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int ans = getSumOfNaturalNumber(N);
        System.out.println("Sum of first " + N + " natural numbers is: " + ans);
    }

    static int getSumOfNaturalNumber(int N){
        if(N == 0) return 0;
        return  N + getSumOfNaturalNumber(N-1);
    }
}
