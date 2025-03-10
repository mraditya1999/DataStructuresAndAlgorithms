package strings;
import java.util.Scanner;

//  Constraints:
//1 <= s.length <= 15
//s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
//It is guaranteed that s is a valid roman numeral in the range [1, 3999].

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Value to convert into a Integer: ");
        String romanNumeral = sc.next();
        int integerValue = convertRomanToInteger(romanNumeral);
        System.out.println("Integer value of " + romanNumeral + " is: " + integerValue);
    }

    static int convertRomanToInteger(String romanNumeral) {
        int sum = 0;
        int currentValue = 0;
        int nextValue = 0;

        for (int i = 0; i < romanNumeral.length() - 1; i++) {
            char currentCharacter = romanNumeral.charAt(i);
            char nextCharacter = romanNumeral.charAt(i + 1);

            currentValue = getIntegerValue(currentCharacter);
            nextValue = getIntegerValue(nextCharacter);

            if (currentValue < nextValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }
        }
        // Add the value of the last character in the string
        sum += getIntegerValue(romanNumeral.charAt(romanNumeral.length() - 1));
        return sum;
    }

    static int getIntegerValue(char romanChar) {
        return switch (romanChar) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
