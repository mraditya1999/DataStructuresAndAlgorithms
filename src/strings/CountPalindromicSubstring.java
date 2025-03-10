package strings;

public class CountPalindromicSubstring {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();
        int count = 0;
        String s = "" ;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length() ; j++) {
                if(isPalindrome(str.substring(i,j))){
                System.out.print(str.substring(i , j) + " ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("no. of palindromic string: " + count);

    }

    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
