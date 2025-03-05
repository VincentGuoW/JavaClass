package A202503Mar2025.Class02;

import java.util.TreeSet;

public class TreeSetDemo1 {
    /*
     * TreeSet ==> 1. No repeat 2. No Index 3. In Order
     * Using red black tree idea in the back end.
     */
    
    //Request: Use TreeSet to store integer



    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(5);
        ts.add(3);
        ts.add(1);
        ts.add(6);

        System.out.println(ts);
    }
}
