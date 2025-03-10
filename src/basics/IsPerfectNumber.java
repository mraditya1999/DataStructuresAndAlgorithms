package basics;
import java.util.Scanner;

public class IsPerfectNumber {
//    A perfect number is a positive integer equal to the total of its positive divisors, except the number itself.
//    For example, 6 is a perfect number since 1 + 2 + 3 equals 6.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check perfect: ");
        int N = sc.nextInt();

        boolean isPerfectNumber = isPerfectNumber(N);
        System.out.println("Is " + N + " Perfect number: " + isPerfectNumber);
    }

    static boolean isPerfectNumber(int N){
        int sum = 0;
        for (int divisor = 1;divisor < N; divisor++){
            if(N % divisor == 0)
                sum = sum + divisor;
        }
        return sum == N;
    }
}
