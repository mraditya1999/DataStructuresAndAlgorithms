package strings;

public class IsEqual {
    public static void main(String[] args) {
        String str1 = StringOperation.takeStringInput().trim();
        String str2 = StringOperation.takeStringInput().trim();

        int length1 = str1.length();
        int length2 = str2.length();

        if(length1 != length2){
            System.out.println("StringOperation are not equal");
            return;
        }

        boolean isTwoStringsEqual = isTwoStringsEqual(str1,str2);
        System.out.println("Is " + str1 + " and " + str2 + " are equal: " + isTwoStringsEqual);
    }

    static boolean isTwoStringsEqual(String str1, String str2){
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}
