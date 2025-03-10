package strings;

import java.util.Scanner;

public class CountWordsInAString {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();

        int noOfWordsInString1 = countNoOfWordsInString1(str);
        int noOfWordsInString2 = countNoOfWordsInString2(str);

        System.out.println("No. of words in a string: " + noOfWordsInString1);
        System.out.println("No. of words in a string: " + noOfWordsInString2);
    }

    public static int countNoOfWordsInString1(String str){
        int count = 0;

        str  =str.trim();
        if(str.isEmpty()){return count;}

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        return count + 1;
    }

    public static int countNoOfWordsInString2(String str){
        int count = 0;

        str  = str.trim();
        String[] words = str.split("\\s+"); // Split by one or more spaces

        for(int i = 0;i<words.length;i++){
                count++;
        }
        return count;
    }
}
