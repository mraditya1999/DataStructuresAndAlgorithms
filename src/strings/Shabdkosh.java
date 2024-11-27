package strings;

import java.util.ArrayList;

public class Shabdkosh {
    public static void main(String[] args) {
        String[] list = {"whisper", "format", "perform", "sonnet", "person", "shopper", "workshop", "network"};
        //O/P - whisper person sonnet network workshop shopper perform format
        ArrayList<String> list2 = new ArrayList<>();


        for (int i = 0; i < list.length; i++) {
            String str1 = list[i];
            String subStr = str1.substring(str1.length() - 3);
            for (int j = 0; j < list.length; j++) {
                if (i != j) {
                    String str2 = list[j];
                    if (str2.startsWith(subStr) && !list2.contains(str2)) {
                        list2.add(str1);
                        list2.add(str2);
                        break;
                    }
                }
            }
        }


        for (String s : list2) {
            System.out.println(s + " ");
        }
    }
}
