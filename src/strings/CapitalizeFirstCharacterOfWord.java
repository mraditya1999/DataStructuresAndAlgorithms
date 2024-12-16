package strings;

public class CapitalizeFirstCharacterOfWord {

    public static void main(String[] args) {
        String str = StringOperations.takeStringInput();

        System.out.println("Before: " + str);

        String result = capitalizeFirstCharacterOfWord(str);
        System.out.println("After: " + result);
    }

    public static String capitalizeFirstCharacterOfWord(String input) {
        StringBuilder result = new StringBuilder();
        int index = 0;

        // Skip leading spaces
        while (index < input.length() && input.charAt(index) == ' ') {
            result.append(' ');
            index++;
        }

        // Capitalize the first character if it's a letter
        if (index < input.length() && input.charAt(index) >= 'a' && input.charAt(index) <= 'z') {
            result.append((char) (input.charAt(index) - 32));
            index++;
        }

        // Process the rest of the string
        while (index < input.length()) {
            char currentChar = input.charAt(index);

            if (currentChar == ' ') {
                result.append(' ');
                index++;
                // Skip multiple spaces
                while (index < input.length() && input.charAt(index) == ' ') {
                    result.append(' ');
                    index++;
                }
                // Capitalize the next character if it's a letter
                if (index < input.length() && input.charAt(index) >= 'a' && input.charAt(index) <= 'z') {
                    result.append((char) (input.charAt(index) - 32));
                } else if (index < input.length()) {
                    result.append(input.charAt(index));
                }
            } else {
                result.append(currentChar);
            }
            index++;
        }

        return result.toString();
    }
}
