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
         s.add("1");
         s.add("2");
         s.add("3");

        System.out.println(r1); //true      one and only
        System.out.println(r2); //true      one and only
        System.out.println(r3); //false     already have Tom in set
        System.out.println(s); //["1","2","Tom","3","Henry"] 
        //There's no order, it might also be ["Tom","Henry","1","2","3"] 
        //But during the same round it will be the same
        //System.out.println(s); ==>Same
        //System.out.println(s); ==>Same
        //System.out.println(s); ==>Same
        //When using diff JAVA or next turn it might be diff
        s.add("4");
        System.out.println(s); //["1","2","Tom","3","4","Henry"] 

     }
}
