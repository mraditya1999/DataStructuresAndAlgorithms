package recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        int index = str.length() - 1;
        reverseString(str, index);
    }

    static void reverseString(String str, int index){
        if (index >= 0) {
            char ch = str.charAt(index);
            System.out.print(ch);
            reverseString(str, index - 1);
        }
    }
}
