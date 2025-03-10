package strings;

public class FindSmallestWord {
    public static void main(String[] args) {
        String sentence = StringOperation.takeStringInput();
        String[] newSentence =  sentence.split(" ");
        String smallestWord = sentence;

        for (String word:newSentence){
            if(word.length() < smallestWord.length()){
                smallestWord = word;
            }
        }
        System.out.println("result: " + smallestWord);
    }
}
