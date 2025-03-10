package strings;

public class CountAll {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();

        int noOfCharacters = 0, vowels = 0, space = 0, consonants = 0, specialChar = 0, words = 0, digits = 0;
        String vowelsSet = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Count every character as a character
            noOfCharacters++;

            if (Character.isLetter(ch) && vowelsSet.contains(String.valueOf(ch))) {
                vowels++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                space++;
                // Count words based on consecutive spaces
                if (i > 0 && !Character.isWhitespace(str.charAt(i - 1))) {
                    words++;
                }
            } else if (Character.isLetter(ch)) {
                consonants++;
            } else {
                specialChar++;
            }
        }

        // Count the last word if it's not followed by a space
        if (Character.isLetterOrDigit(str.charAt(str.length() - 1))) {
            words++;
        }

        System.out.println("Number of characters in the string are: " + noOfCharacters);
        System.out.println("Number of vowels in the string are: " + vowels);
        System.out.println("Number of consonants in the string are: " + consonants);
        System.out.println("Number of digits in the string are: " + digits);
        System.out.println("Number of special characters in the string are: " + specialChar);
        System.out.println("Number of spaces in the string are: " + space);
        System.out.println("Number of words in the string are: " + words);
    }
}
