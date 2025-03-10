package basics;

import java.util.Scanner;

public class IsPrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term: ");
        int firstTerm = sc.nextInt();

        System.out.print("Enter second term: ");
        int secondTerm = sc.nextInt();

        for (int i = firstTerm; i <= secondTerm ; i++) {
            if(IsPrimeNumber.isPrimeNumberMethod3(i)){
                System.out.println(i + " ");
            }
        }
    }
}
