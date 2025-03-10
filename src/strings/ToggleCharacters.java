package strings;

public class ToggleCharacters {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiValue = (int) ch;

            if (ch >= 'A' && ch <= 'Z') {
                asciiValue += 32;
                ch = (char) asciiValue;
                str = str.substring(0,i) + ch + str.substring(i+1);
            } else if (asciiValue >= 97 && asciiValue <= 122) {
                asciiValue -= 32;
                ch = (char) asciiValue;
                str = str.substring(0,i) + ch + str.substring(i+1);
            }
        }
            System.out.println(str);
    }
}