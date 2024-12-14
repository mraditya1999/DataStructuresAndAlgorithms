package strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "this is a string ";
        String str1 = "Aditya";
        String str2 = "Aditya";
        int number = 242;

        //        convert character array into string
        char[] charArray = {'a', 'b', 'c', 'd'};
        String charStr = new String(charArray);
        System.out.println(charStr);

        //        convert byte array into string
        byte[] byteArray = {65, 66, 67, 68, 69};
        String byteStr = new String(byteArray);
        System.out.println(byteStr);

        // Output the results of various String methods
        System.out.println(str1 == str2);       // compare reference
        System.out.println(str1.equals(str2));                // compare value
        System.out.println(str1.equalsIgnoreCase(str2));     // true
        System.out.println(str.startsWith("this"));           // true
        System.out.println(str.endsWith("this"));             // false
        System.out.println(str.isEmpty());                    // false
        System.out.println(str.isBlank());                    // false
        System.out.println(str.contains("string"));           // true
        System.out.println(str.charAt(0));                    // 't'
        System.out.println(str.toUpperCase());                // "THIS IS A STRING "
        System.out.println(str.toLowerCase());                // "this is a string "
        System.out.println(str.trim());                       // "this is a string"
        System.out.println(Arrays.toString(str.split(" ")));  // [this, is, a, string, ]
        System.out.println(str.substring(0, 5));              // "this "
        System.out.println(str.replace("string", "secret"));  // "this is a secret "
        System.out.println(String.valueOf(number));           // "242" convert any data type into string
        System.out.println(str1.indexOf("d"));           // 5
        System.out.println(str1.lastIndexOf('y'));           // 5
        System.out.println(str1.compareTo(str2));           // compare both string in dictionary order which word comes first
    }
}
