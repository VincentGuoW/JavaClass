package May2024.Class20;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        //String joiner
        int[] arr = {1,2,3,4,5};
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");//why add with ""
            //String + anything(e.g. int/char/byte...) => String
            //The purpose of this add zero value String is
            //Change INT TO STRING!!!!
          
        }
        System.out.println(sj.toString());
        
        StringJoiner sj2 = new StringJoiner(",","[","]");
        sj2.add("aaa").add("bbb").add("ccc");
        System.out.println(sj2.toString());
    }
}
