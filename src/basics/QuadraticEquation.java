package basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double determinant = Math.pow(b, 2) - 4 * a * c;

        if (determinant > 0) {
            System.out.println("Roots are " + (-b + Math.sqrt(determinant)) / (2 * a) + " and " + (-b - Math.sqrt(determinant)) / (2 * a));
        } else if (determinant == 0) {
            System.out.println("Root is " + (-b / (2 * a)));
        } else {
            System.out.println("Roots are " + (-b / (2 * a)) + " + i" + (Math.sqrt(-determinant) / (2 * a)) + " and " + (-b / (2 * a)) + " - i" + (Math.sqrt(-determinant) / (2 * a)));
        }
    }
}
