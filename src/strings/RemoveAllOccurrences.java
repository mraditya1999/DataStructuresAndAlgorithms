package strings;

import java.util.Scanner;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter target character: ");
        char target = sc.next().charAt(0);

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
