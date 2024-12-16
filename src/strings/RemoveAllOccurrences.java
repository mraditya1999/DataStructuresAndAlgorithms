package strings;

import java.util.Scanner;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        String str = StringOperations.takeStringInput();

        System.out.print("Enter target character: ");
        char target = StringOperations.takeCharacterInput();

        String ans = removeAllOccurrences(str, target, 0);
        System.out.println("After removing '" + target + "' from \"" + str + "\": " + ans);
    }

    public static String removeAllOccurrences(String str, char target, int index) {
        if (str.length() == index) {
            return "";
        }
        if (str.charAt(index) == target) {
            return removeAllOccurrences(str, target, index + 1);
        } else {
            return str.charAt(index) + removeAllOccurrences(str, target, index + 1);
        }
    }
}
