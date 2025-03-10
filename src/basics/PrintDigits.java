package basics;
import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Nth term: ");
        int N = sc.nextInt();

        int totalNoOfDigits = countTotalNoOfDigits(N);
        printDigits(N,totalNoOfDigits);
    }

    static  int countTotalNoOfDigits(int N){
        int totalNoOfDigits = 0;
        while(N != 0){
            totalNoOfDigits++;
            N = N/10;
        }
        return totalNoOfDigits;
    }

    static void printDigits(int N, int totalNoOfDigits){
        int divisor = (int) Math.pow(10, totalNoOfDigits - 1);
        while (divisor != 0){
            int quotient = N / divisor;
            System.out.print(quotient + " ");
            N = N % divisor;
            divisor = divisor / 10;
        }
    }

}
