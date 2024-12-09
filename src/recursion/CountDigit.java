package recursion;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int ans = countDigit(N);
        System.out.println("No of digits in " + N + " is " + ans);
    }

    public static int countDigit(int N) {
        if (N == 0) return 0;
        return 1 + countDigit(N / 10);
    }
}
