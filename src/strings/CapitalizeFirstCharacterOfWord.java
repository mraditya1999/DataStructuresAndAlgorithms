package strings;

public class CapitalizeFirstCharacterOfWord {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();
        StringBuilder result = new StringBuilder();
        result = capitalizeFirstCharacterOfWord(str);
        System.out.println("result: " + result);
    }

    static StringBuilder capitalizeFirstCharacterOfWord(String str){
        String[] newStr = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word: newStr){
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }

        return result;
    }
}