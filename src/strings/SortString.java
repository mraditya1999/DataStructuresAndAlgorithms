package strings;

public class SortString {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();
        StringBuilder sorted_string = sortString(str);
        System.out.println(sorted_string);
    }

    static StringBuilder sortString(String str){
        int[] frequency_arr = new int[26]; // 26 alphabet characters
        StringBuilder sorted_string = new StringBuilder();

        // storing frequency of every character in string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            frequency_arr[index]++;
        }

        // create our sorted string
        for (int i = 0; i < 26 ; i++) {
            while(frequency_arr[i]-- != 0){
                char ch = (char)(i + 'a');
                sorted_string.append(ch);
            }
        }
        return sorted_string;
    }
}
