package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string to reverse: ");
        String str = sc.next();

        // String reversedStr1 = reverseString1(str);
        // String reversedStr2 = reverseString2(str);
        // String reversedStr3 = reverseString3(str);
        String reversedStr4 = reverseString4(str);

        System.out.println("reverse of : "+ str + " is: " + reversedStr4);
    }

    public static String reverseString1(String str){
        String reversedStr = "";
        for(int i = str.length()-1; i >= 0 ;i--){
            char ch = str.charAt(i);
            reversedStr += ch;
        }
        return reversedStr;
    }

    public static String reverseString2(String str){
        String reversedStr = "";
        for(int i = 0; i < str.length() ;i++){
            char ch = str.charAt(i);
            reversedStr = ch + reversedStr;
        }
        return reversedStr;
    }

    public static String reverseString3(String str){
        StringBuilder reversedStr = new StringBuilder("");
        for(int i = str.length()-1; i >= 0 ;i--){
            char ch = str.charAt(i);
            reversedStr.append(ch);
        }
        return reversedStr.toString();
    }

    public static String reverseString4(String str){
        StringBuilder reversedStr = new StringBuilder(str);
        int start = 0;
        int end = reversedStr.length() - 1;

        while(start < end){
            char startChar = reversedStr.charAt(start);
            char endChar = reversedStr.charAt(end);

            reversedStr.setCharAt(start,endChar);
            reversedStr.setCharAt(end,startChar);
            start++;
            end--;
        }
        return reversedStr.toString();
    }
}
