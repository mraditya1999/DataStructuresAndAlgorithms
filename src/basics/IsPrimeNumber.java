package basics;
import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check prime: ");
        int N = sc.nextInt();

//        boolean isPrimeNumber = isPrimeNumberMethod1(N);
//        boolean isPrimeNumber = isPrimeNumberMethod2(N);
        boolean isPrimeNumber = isPrimeNumberMethod3(N);
        System.out.println("Is " + N + " prime number: " + isPrimeNumber);
    }

    static boolean isPrimeNumberMethod1(int number){
        int count = 0;
        for (int i = 1; i <= number ; i++) {
            if(number % i == 0){
                count++;
                if(count > 2) return false;
            }
        }

        return true;
    }

    static boolean isPrimeNumberMethod2(int number){
        for (int i = 2; i < number ; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    static boolean isPrimeNumberMethod3(int number){
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
