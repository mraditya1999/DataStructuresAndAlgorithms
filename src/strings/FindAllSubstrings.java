package strings;

public class FindAllSubstrings {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();
        char ch = StringOperation.takeCharacterInput();

        int substringCount = countSubstrings(str);
        int stringsStartEndCount = substringsStartEndCounter(str, ch);

        System.out.println();
        System.out.println("Total no. of substring is: " + substringCount);
        System.out.println("Substring starts and ends with " + ch + " count is: "  + stringsStartEndCount);

    }

    static int countSubstrings(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length() ; j++) {
                System.out.print(str.substring(i,j) + " ");
                count++;
            }
        }
        return count;
    }

    // Count Substrings Starting and Ending with Given Character
    static int substringsStartEndCounter(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String newStr = str.substring(i, j);
                char firstCharacter = newStr.charAt(0);
                char lastCharacter = newStr.charAt(newStr.length() - 1);
                if (firstCharacter == c && lastCharacter == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
