package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersCount {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();

        //   LearnJavaProgramming
        HashMap<Character, Integer> charCountMap = duplicateCharacterCount(str);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if(entry.getValue() > 1)
                System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static HashMap<Character,Integer> duplicateCharacterCount(String str){
        char[] stringArray = str.toCharArray();
        HashMap<Character,Integer> charCount = new HashMap<>();

        for(char c : stringArray){
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }else{
                charCount.put(c,1);
            }
        }
        return charCount;
    }
}
