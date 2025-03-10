package strings;

public class FindLargestWord {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();
        String[] newStr =  str.split(" ");
        String largestWord = "";

        for (String word:newStr){
            if(word.length() > largestWord.length()){
                largestWord = word;
            }
        }
        System.out.println("result: " + largestWord);
    }
}
