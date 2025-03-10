package basics;

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        int sumOfFirstNaturalNumbers = N * (N + 1) / 2;
        System.out.println("Sum of first " + N + " Natural numbers is: " + sumOfFirstNaturalNumbers);
    }

    public static int reverseNumber(int N){
        int reversedNumber = 0;
        while(N != 0){
            int remainder = N % 10;
            reversedNumber = remainder + reversedNumber * 10;
            N = N/10;
        }
        return reversedNumber;
    }

    public static int countTotalNumberOfDigits(int N){
        int totalNoOfDigits = 0;
        while(N != 0){
            totalNoOfDigits++;
            N = N/10;
        }
        return totalNoOfDigits;
    }

    public static void printMultiplicationTable(int N){
        for (int i = 1; i <= 10; i++){
            System.out.println(N + " X " + i + " = " + N * i);
        }
    }

    public static void swapTwoNumbers(int number1, int number2){
        System.out.println("Before: number1 = " + number1 + " number2 = " + number2);
//        METHOD 1 (temp variable)
        int temp = number1;
        number1 = number2;
        number2 = temp;

//        METHOD 2 (without third variable)
        number1 = number1  + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

//        METHOD 3 (bitwise operator)
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        System.out.println("After: number1 = " + number1 + " number2 = " + number2);
    }
}
