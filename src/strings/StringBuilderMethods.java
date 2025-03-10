package strings;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("this is a string ");

        // Modify the character at index 0 to 'Z'
        str1.setCharAt(0, 'Z');
        System.out.println(str1);  // Zhis is a string

        // Insert 'Z' at the beginning
        str1.insert(0, 'Z');
        System.out.println(str1);  // ZZhis is a string

        // Delete the character at index 0
        str1.delete(0, 1);
        System.out.println(str1);  // Zhis is a string

        // Delete the character at index 0
        str1.deleteCharAt(0);
        System.out.println(str1);  // his is a string

        // Append " yadav" to the end
        str1.append(" yadav");
        System.out.println(str1);  // his is a string  yadav
        // Reverse the entire string
        str1.reverse();
        System.out.println(str1);  // vaday  gnirts a si sih
    }
}
