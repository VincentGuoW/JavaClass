package A202503Mar2025.Class07;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //String "aabdfaoiwejfiaoe"
        //RQ each char, shows how many time in String
        //And in order, a - b - c ... z
        String sampleString = "aabdfaoiwejfiaoe";

        TreeMap<Character,Integer> tm = new TreeMap<>();
        
        for (int i = 0; i < sampleString.length(); i++) {
            char inputChar = sampleString.charAt(i);
            if(tm.containsKey(inputChar)){
                tm.put(inputChar, tm.get(inputChar)+1);
            }else{
                tm.put(inputChar, 1);
            }
        }
        System.out.println(tm);
    }
}
