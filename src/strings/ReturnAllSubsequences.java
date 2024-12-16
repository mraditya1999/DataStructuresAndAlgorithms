package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnAllSubsequences {
    public static void main(String[] args) {
        String inputString = StringOperations.takeStringInput();

        ArrayList<String> subsequences = getAllSubsequences(inputString);
        for (String subsequence : subsequences) {
            System.out.print(subsequence + " ");
        }

        System.out.println();
        displayAllSubsequences(inputString, "");
    }

    public static ArrayList<String> getAllSubsequences(String inputString) {
        ArrayList<String> subsequencesList = new ArrayList<>();
        if (inputString.isEmpty()) {
            subsequencesList.add("");
            return subsequencesList;
        }

        char firstChar = inputString.charAt(0);
        ArrayList<String> remainingSubsequences = getAllSubsequences(inputString.substring(1));
        for (String subsequence : remainingSubsequences) {
            subsequencesList.add(subsequence);
            subsequencesList.add(firstChar + subsequence);
        }
        return subsequencesList;
    }

    public static void displayAllSubsequences(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        String rem = str.substring(1);

        displayAllSubsequences(rem, ans + ch);
        displayAllSubsequences(rem, ans);
    }
}
