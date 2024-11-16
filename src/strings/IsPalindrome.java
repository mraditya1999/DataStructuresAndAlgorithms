package strings;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();

        String reversedString = reverseString(str);
        boolean isPalindrome1 = isPalindrome(str, reversedString);
        boolean isPalindrome2 = isPalindrome(str, 0, str.length() - 1);

        System.out.println("Is Palindrome: " + isPalindrome1);
        System.out.println("Is Palindrome: " + isPalindrome2);
    }

    public static String reverseString(String str) {
        if (str.isEmpty() || str.length() == 1) return str;
        return reverseString(getSubString(1, str)) + str.charAt(0);
    }

    public static boolean isPalindrome(String str, int start, int end) {
//        If single character is there
        if (start >= end) return true;
//        if start character and end character are different
        if (str.charAt(start) != str.charAt(end)) return false;
//        increment start,decrement end
        return isPalindrome(str, start + 1, end - 1);
    }

    public static boolean isPalindrome(String str, String reversedString) {
        if (str.equals(reversedString)) return true;
        return false;
    }

    public static String getSubString(int start, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


}
