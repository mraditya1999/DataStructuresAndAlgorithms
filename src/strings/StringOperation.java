package strings;
import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
            String str1 = takeStringInput();
            String str2 = takeWordInput();
            char ch = takeCharacterInput();

        System.out.println("string: " + str1);
        System.out.println("word: " + str2);
        System.out.println("character: " + ch);
    }

    static String takeStringInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    static String takeWordInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        return sc.next();
    }

    static char takeCharacterInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        return sc.next().charAt(0);
    }

    static StringBuilder reverseString(String str){
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            reversedStr.append(ch);
        }
        return reversedStr;
    }

    static String reverseStringMethod1(String str){
        String reversedStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            reversedStr = ch + reversedStr;
        }
        return reversedStr;
    }

    static String appendString(String str, String appendedStr){
        return str + " " + appendedStr;
    }

    static String extractUsernameFromEmail(String email){
        return email.substring(0,email.indexOf('@'));
    }

    static StringBuilder replaceCharacter(String str){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character you want to replace: ");
        char from = sc.next().charAt(0); // get only single character
        System.out.print("Enter a character you want to replace with: ");
        char to = sc.next().charAt(0); // get only single character

        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == from){
                newStr.append(to);
            }else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr;
    }
}
