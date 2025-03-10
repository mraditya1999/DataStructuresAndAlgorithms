package basics;
import java.util.Scanner;

public class DisplayDigitsInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its digit in words: ");
        int N = sc.nextInt();

        int totalNoOfDigits = countTotalNoOfDigits(N);
        displayDigitsInWords(N,totalNoOfDigits);
    }

    static  int countTotalNoOfDigits(int N){
        int totalNoOfDigits = 0;
        while(N != 0){
            totalNoOfDigits++;
            N = N/10;
        }
        return totalNoOfDigits;
    }

    static void displayDigitsInWords(int N, int totalNoOfDigits){
        int divisor = (int) Math.pow(10, totalNoOfDigits - 1);
        while (divisor != 0){
            int quotient = N / divisor;
            displayInWords(quotient);
            N = N % divisor;
            divisor = divisor / 10;
        }
    }

    public static void displayInWords(int num) {
        switch (num) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            default:
                System.out.print("Invalid number");
        }


    }
}