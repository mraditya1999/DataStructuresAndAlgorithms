package strings;

public class ChangeCase {
    public static void main(String[] args) {
        String str = StringOperations.takeStringInput();
        System.out.println("Before: " + str);

        String lowercaseString = changeToLowercase(str);
        String uppercaseString = changeToUppercase(str);

        System.out.println("lowercase: " + lowercaseString);
        System.out.println("uppercase: " + uppercaseString);
    }

    public static String changeToUppercase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String changeToLowercase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
