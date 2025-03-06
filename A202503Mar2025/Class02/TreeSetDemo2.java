package A202503Mar2025.Class02;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /*
         * TreeSet low to high: 
         *      1.Integer, Double small to big number
         *      2.String, ASCII number low to high
         */
        System.out.println();
        System.out.println( (int) 'a');

        TreeSet<String> ts = new TreeSet<>();
        ts.add("AB");
        
        ts.add("D");
        ts.add("A");
        ts.add("AAA");
        ts.add("AC");
        System.out.println(ts);//[A, AAA, AB, AC, D]
    }
}
