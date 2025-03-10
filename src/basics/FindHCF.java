package basics;
import java.util.Scanner;

public class FindHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        int ans = Math.min(number1, number2);
        while (ans > 0) {
            if (number1 % ans == 0 && number2 % ans == 0) {
                break;
            }
            ans--;
        }
        System.out.println("HCF of " + number1 + " and " + number2 + " is: " + ans);
    }
}
