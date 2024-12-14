package basics;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        int ans = findFactorial(N);
        System.out.println("Factorial of : " + N + " is: " + ans);
    }

    public static int findFactorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
