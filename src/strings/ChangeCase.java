package strings;

public class ChangeCase {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();

        StringBuilder lowercaseString = changeToLowerCase(str);
        StringBuilder uppercaseString = changeToUpperCase(str);

        System.out.println("lowercase: " + lowercaseString);
        System.out.println("uppercase: " + uppercaseString);
    }

    static StringBuilder changeToLowerCase(String str){
        StringBuilder lowercaseString = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int asciiValue = (int)ch + 32;
            if(ch >= 'A' && ch <= 'Z') lowercaseString.append((char)asciiValue);
            else lowercaseString.append(ch);
        }
        return lowercaseString;
    }

    static StringBuilder changeToUpperCase(String str){
        StringBuilder uppercaseString = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int asciiValue = (int)ch - 32;
            if(ch >= 'a' && ch <= 'z'){
                uppercaseString.append((char)asciiValue);
            }else{
                uppercaseString.append(ch);
            }
        }
        return uppercaseString;
    }
}
