package strings;

public class IsRotated {
    public static void main(String[] args) {
        String str1 = StringOperation.takeWordInput(); // Leetcode
        String str2 = StringOperation.takeWordInput(); // deLeetco
        // how many time string is rotated
        int k = 2;

        if(str1.length() != str2.length()) return;

       boolean isRotated = isRotated(str1, str2, k);
        System.out.println("Is " + str2 + " rotated: " + isRotated);
    }

    static boolean isRotated(String str1, String str2, int k) {
        String ans = "";

        ans = RotateString.leftRotateString(str2, k);
        if (str1.equals(ans)) return true;

        ans = RotateString.rightRotateString(str2, k);
        return str1.equals(ans);
    }
}
