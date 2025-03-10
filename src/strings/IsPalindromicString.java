package strings;

public class IsPalindromicString {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();
        boolean isPalindromicString = isPalindromicString(str);
        System.out.println("Is " + str + " Palindromic string: " + isPalindromicString);
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
}
