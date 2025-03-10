package strings;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        // i am good -> i ma doog
        String str = StringOperation.takeStringInput();
        String reversedStr = reverseEachWord(str);

        System.out.println("Original sentence is: " + str);
        System.out.println("Reversed sentence is: " + reversedStr);
    }

    public static String reverseEachWord(String str){
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for(int i= 0;i< str.length();i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                result.append(word.reverse()).append(' ');
                word.setLength(0);
            }else{
                word.append(ch);
            }
        }
        result.append(word.reverse()).append(" ");
        return result.toString();
    }
}
