package strings;

// input - is2 sentence4 this1 a3 (only 0-9 number are given )
// output - this is a sentence
public class SortSentenceForGivenPosition {
    public static void main(String[] args) {
        String str = "is2 sentence4 this1 a3";

        StringBuilder sortedString1 = getSortedSentenceMethod1(str);
        StringBuilder sortedString2 = getSortedSentenceMethod2(str);

        System.out.println("Sorted sentence is: " + sortedString1);
        System.out.println("Sorted sentence is: " + sortedString2);
    }


    static StringBuilder getSortedSentenceMethod1(String str){
        String[] arr = str.split(" ");
        String[] frequency_arr = new String[10];

        StringBuilder sortedString = new StringBuilder();


        for (String word: arr){
            int lastCharIndex = word.length() - 1; // Get the last character's index
            char lastChar = word.charAt(lastCharIndex); // Get the last character

            // Check if the last character is a digit
            if (Character.isDigit(lastChar)) {
                int index = Character.getNumericValue(lastChar); // Convert character to integer
                if (index >= 0 && index < frequency_arr.length) {
                    frequency_arr[index] = word.substring(0, lastCharIndex) + " "; // Add word without last character
                }
            }
        }

        for (String word : frequency_arr) {
            if(word != null) sortedString.append(word);
        }

        // Remove the trailing space if exists
        if (!sortedString.isEmpty() && sortedString.charAt(sortedString.length() - 1) == ' ') {
            sortedString.deleteCharAt(sortedString.length() - 1);
        }
        return sortedString;
    }

    static StringBuilder getSortedSentenceMethod2(String str){
        String[] arr = new String[9];
        StringBuilder word = new StringBuilder();
        StringBuilder sortedString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
               if(ch != ' '){
                   word.append(ch);
               } else{
                   int index = Integer.parseInt("" + word.charAt(word.length() - 1));
                   String removedPosition = word.substring(0, word.length() - 1);
                   arr[index] = removedPosition + " ";
                   word = new StringBuilder();
               }
        }

        int index = Integer.parseInt("" + word.charAt(word.length() - 1));
        String removedPosition = word.substring(0, word.length() - 1);
        arr[index] = removedPosition + " ";


        for (String s : arr) {
            if(s != null) sortedString.append(s);
        }

        return sortedString;
    }
}
