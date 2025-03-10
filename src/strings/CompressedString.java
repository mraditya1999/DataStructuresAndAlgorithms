package strings;

public class CompressedString {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();
        StringBuilder compressedString1;
        StringBuilder compressedString2;

        compressedString1 = compressStringMethod1(str);
        compressedString2 = compressStringMethod2(str);
        System.out.println("Compressed string is: " + compressedString1);
        System.out.println("Compressed string is: " + compressedString2);
    }

    //  aaabbbccd -> a3b3c2d
    static StringBuilder compressStringMethod1(String str){
        StringBuilder result = new StringBuilder("" + str.charAt(0));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                // Append count if greater than 1
                if (count > 1) {
                    result.append(count);
                }
                // Reset count and append current character
                count = 1;
                result.append(curr);
            }
        }
        // Append the count of the last character sequence if greater than 1
        if (count > 1) {
            result.append(count);
        }
        return result;
    }

    static StringBuilder compressStringMethod2(String str){
        int[] frequency_arr = new int[26]; // 26 alphabets
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int asciiValueOfCharacter = ch - 'a';
            frequency_arr[asciiValueOfCharacter]++;
        }

        for (int i = 0; i <frequency_arr.length ; i++) {
            if(frequency_arr[i] != 0){
                char ch = (char)(i + (int)'a');
                result.append(ch);
                if(frequency_arr[i] > 1){
                    result.append(frequency_arr[i]);
                }
            }
        }
        return result;
    }
}

