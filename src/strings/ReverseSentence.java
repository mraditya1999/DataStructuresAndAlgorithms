package strings;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();

        StringBuilder reversedSentence1 = reverseSentenceMethod2(str);
        StringBuilder reversedSentence2 = reverseSentenceMethod1(str);

        System.out.println("Reversed sentence is: " + reversedSentence1);
        System.out.println("Reversed sentence is: " + reversedSentence2);
    }

    // i am good -> ["i", "am", "good"] -> good am i
    static StringBuilder reverseSentenceMethod1(String str){
        String[] arr = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedSentence.append(arr[i]).append(" ");
        }
        return reversedSentence;
    }

    // i am good -> doog ma i -> good am i
    static StringBuilder reverseSentenceMethod2(String str){
        StringBuilder reversedString = StringOperation.reverseString(str); // doog ma i
        StringBuilder word = new StringBuilder();
        StringBuilder reversedSentence = new StringBuilder(); // good am i

        for (int i = 0; i < reversedString.length() ; i++) {
            char ch = reversedString.charAt(i);
            if(ch != ' '){
                word.append(ch);
            } else{
                word.reverse();
                reversedSentence.append(word).append(" ");
                word = new StringBuilder();
            }
        }

        reversedSentence.append(word);
        return reversedSentence;
    }
}
