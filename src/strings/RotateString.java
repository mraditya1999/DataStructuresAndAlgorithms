package strings;
import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to rotate: ");
        String str = sc.nextLine();

        System.out.print("Enter how many times you want to rotate: ");
        int k = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter rotation direction (left/right): ");
        String direction = sc.nextLine().trim().toLowerCase();

        String rotatedString = rotateString(str, k, direction);
        System.out.println("Rotated String: " + rotatedString);
    }

    static String rotateString(String str, int k, String direction) {
        k = k % str.length();
        if (direction.equals("left")) {
            return leftRotateString(str, k);
        } else if (direction.equals("right")) {
            return rightRotateString(str, k);
        } else {
            System.out.println("Invalid direction. Please enter 'left' or 'right'.");
            return str;
        }
    }

    static String leftRotateString(String str, int k) {
        return str.substring(k) + str.substring(0, k);
    }

    static String rightRotateString(String str, int k) {
        return str.substring(str.length() - k) + str.substring(0, str.length() - k);
    }
}
