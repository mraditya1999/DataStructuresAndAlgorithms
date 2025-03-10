package strings;

// input - 255.255.255.255
// output - 255[.]255[.]255[.]255
public class DefangingAnIpAddress {
    public static void main(String[] args) {
        String str = "255.255.255.255";
        StringBuilder ans = getDefangedIpAddress(str);
        System.out.println(ans);
    }   

    static StringBuilder getDefangedIpAddress(String str){
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch == '.')ans.append("[.]");
             else ans.append(ch);
        }
        return ans;
    }
}
