package strings;
import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to convert to a Roman numeral: ");
        int number = sc.nextInt();

        String romanNumber = convertIntegerToRoman(number);
        System.out.println("Roman value of " + number + " is: " + romanNumber);
    }

    // Helper method to count the total number of digits in a number
    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Method to convert an integer to its Roman numeral representation
    static String convertIntegerToRoman(int num) {
        StringBuilder romanValue = new StringBuilder();
        int totalDigits = countDigits(num);
        int divisor = (int) Math.pow(10, totalDigits - 1);

        while (divisor != 0) {
            int quotient = num / divisor;
            int integerPart = quotient * divisor;
            romanValue.append(getRomanValue(integerPart));
            num = num % divisor;
            divisor = divisor / 10;
        }
        return romanValue.toString();
    }

    // Method to get the Roman numeral value for specific integer parts
    static String getRomanValue(int num) {
        return switch (num) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            case 20 -> "XX";
            case 30 -> "XXX";
            case 40 -> "XL";
            case 50 -> "L";
            case 60 -> "LX";
            case 70 -> "LXX";
            case 80 -> "LXXX";
            case 90 -> "XC";
            case 100 -> "C";
            case 200 -> "CC";
            case 300 -> "CCC";
            case 400 -> "CD";
            case 500 -> "D";
            case 600 -> "DC";
            case 700 -> "DCC";
            case 800 -> "DCCC";
            case 900 -> "CM";
            case 1000 -> "M";
            case 2000 -> "MM";
            case 3000 -> "MMM";
            case 4000 -> "MMMM";
            default -> "";
        };
    }
}
