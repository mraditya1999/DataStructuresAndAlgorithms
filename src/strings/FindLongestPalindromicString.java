package strings;

public class FindLongestPalindromicString {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();

        String longestPalindromicString = getLongestPalindromicString(str);
        int longestPalindromicStringLength = getLongestPalindromicStringLength(str);

        System.out.println("Longest palindromic string: " + longestPalindromicString);
        System.out.println("Longest palindromic string length: " + longestPalindromicStringLength);
    }

    static boolean isPalindromicString(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static String getLongestPalindromicString(String str) {
        String substring = "";
        String longestPalindromicString = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substring = str.substring(i, j);
                if (isPalindromicString(substring)) {
                    if (substring.length() > longestPalindromicString.length())  longestPalindromicString = substring;
                }
            }
        }
        return longestPalindromicString;
    }

    static int getLongestPalindromicStringLength(String str) {
        int[] lowercase = new int[26]; // 26 alphabets
        int[] uppercase = new int[26]; // 26 alphabets

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                int asciiValue = (int) ch;
                int index = asciiValue  - 'a';
                lowercase[index]++;
            } else if(ch >= 'A' && ch <= 'Z'){
                int asciiValue = (int) ch;
                int index = asciiValue  - 'A';
                uppercase[index]++;
            }
        }

        int length = 0;
        int odd = 0;
        for (int i = 0; i < 26 ; i++) {
            if(lowercase[i] % 2 == 0){
                length += lowercase[i];
            }
            else {
                length += lowercase[i] - 1;
                odd = 1;
            }

            if(uppercase[i] % 2 == 0) {
                length += uppercase[i];
            }
             else {
                length += uppercase[i] - 1;
                odd = 1;
            }
        }
        return length + odd;
    }

}