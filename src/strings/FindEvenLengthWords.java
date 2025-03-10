package strings;

public class FindEvenLengthWords {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();
        String[] newSentence = str.split(" ");
        StringBuilder evenLengthWords = new StringBuilder();

        for (String word : newSentence){
            if((word.length() % 2) == 0){
                evenLengthWords.append(word).append(" ");
            }
        }
        System.out.println("result: " + evenLengthWords);
    }
}
