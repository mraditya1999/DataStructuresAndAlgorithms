package basics;
import java.util.Scanner;

public class FindSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find sum of digits: ");
        int number=sc.nextInt();

        int sumOfDigit = 0;
        int temp = number;
        while (temp != 0){
            int digit = temp % 10;
            sumOfDigit = sumOfDigit + digit;
            temp = temp/10;
        }
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigit);
    }
}
