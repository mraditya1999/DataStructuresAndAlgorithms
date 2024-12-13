package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();
        System.out.println("Before: " + str);

        String reversedString1 = reverseStringMethod1(str);
        System.out.println("After Method1: " + reversedString1);

        String reversedString2 = reverseStringMethod2(str);
        System.out.println("After Method2: " + reversedString2);

        String reversedString3 = reverseStringMethod3(str, 0);
        System.out.println("After Method3: " + reversedString3);

    }

    public static String reverseStringMethod1(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reversedStr += ch;
        }
        return reversedStr;
    }

    public static String reverseStringMethod2(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char ch = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = ch;
            start++;
            end--;
        }
        return new String(charArray);
    }

    public static String reverseStringMethod3(String str, int index) {
        if (index == str.length()) return "";
        return reverseStringMethod3(str, index + 1) + str.charAt(index);
    }
}
