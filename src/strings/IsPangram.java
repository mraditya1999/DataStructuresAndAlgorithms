package strings;

public class IsPangram {
    public static void main(String[] args) {
        String str1 = "thequickbrownfoxjumpsoverthelazydog";
        String str2 = "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG";
        boolean isPangram;

        isPangram = isPangramLowercase(str1);
        System.out.println("Is \"" + str1 + "\" a pangram (lowercase): " + isPangram);

        isPangram = isPangramUppercase(str2);
        System.out.println("Is \"" + str2 + "\" a pangram (uppercase): " + isPangram);
    }

    static boolean isPangramLowercase(String str){
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                isPresent[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!isPresent[i]) return false;
        }
        return true;
    }

    public static boolean isPangramUppercase(String str) {
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                isPresent[ch - 'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!isPresent[i]) return false;
        }
        return true;
    }
}
