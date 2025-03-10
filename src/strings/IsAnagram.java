package strings;

import java.util.HashMap;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = StringOperation.takeStringInput();
        String str2 = StringOperation.takeStringInput();

        boolean isAnagram = isAnagram(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
}
