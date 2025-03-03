package A202503Mar2025.Class01;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    /*
     * 1. Not in order
     * 2. One and only
     * 3. No index (no for / index loop)
     */

     public static void main(String[] args) {
        System.out.println();
        Set<String> s = new HashSet<>();
        boolean r1 = s.add("Tom");
        boolean r2 = s.add("Henry");
        boolean r3 = s.add("Tom");

        System.out.println(r1); //true      one and only
        System.out.println(r2); //true      one and only
        System.out.println(r3); //false     already have Tom in set
        System.out.println(s); //["Tom","Henry"] 
        //==>First Tom already in will stay, second Tom will get abandoned.
        // So it's ["Tom","Henry"]  not ["Henry","Tom"] 
     }
}
