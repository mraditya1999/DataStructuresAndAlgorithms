package basics;

import java.util.Scanner;

public class IsPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        boolean isPerfect = isPerfect(N);
        System.out.println("Is Perfect: " + isPerfect);
    }

    public static boolean isPerfect(int N) {
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) sum += i;
        }
        return sum == N;
    }
}
