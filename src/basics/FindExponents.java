package basics;
import java.util.Scanner;

public class FindExponents {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int exponent = 1;
        for (int i = 1; i <= power; i++) {
            exponent = exponent * base;
        }
        System.out.println("Exponents of base " + base + " and power " +  power + " is " + exponent);
    }
}
