package recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int ans = getSumOfDigits(N);
        System.out.println("Sum of digits in " + N + " is: " + ans);
    }

    static int getSumOfDigits(int N){
        if(N == 0) return 0;
       return (N % 10) + getSumOfDigits(N / 10);
    }
}
