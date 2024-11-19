package basics;
import java.util.Scanner;

public class HappyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int N = sc.nextInt();

        boolean isHappyNumber = isHappyNumber(N);
        System.out.println("Is happy: " + isHappyNumber);
    }

    public static boolean isHappyNumber(int N) {
        for (int i = 0; i < 10; i++) {
            int sum = 0;


            while (N != 0) {
                int last_digit = N % 10;
                N = N / 10;
                sum += last_digit * last_digit;
            }
            N = sum;


            if (sum == 1) {
                return true;
            }

        }
        return false;
    }
}
