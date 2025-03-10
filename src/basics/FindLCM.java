package basics;
import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        int ans = Math.max(number1, number2);
        while (ans % number1 != 0 || ans % number2 != 0) {
            ans++;
        }
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + ans);
    }
}
