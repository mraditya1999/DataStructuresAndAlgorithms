package strings;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEachWord {
    public static void main(String[] args) {
        String str = StringOperation.takeStringInput();

//        Test Automation Java Automation
        HashMap<String,Integer> ans =  countOccurenceOfEachWord(str);
        for(Map.Entry<String,Integer> entry:ans.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static HashMap<String,Integer> countOccurenceOfEachWord(String inputString){
        String[] stringArray = inputString.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(String s: stringArray){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }

        return  map;
    }
}
