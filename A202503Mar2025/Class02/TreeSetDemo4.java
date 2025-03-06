package A202503Mar2025.Class02;

import java.util.TreeSet;

public class TreeSetDemo4 {
    // "c","ab","df","qwer"
    // Order in legth, if length the same then order in char
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(( o1,  o2) -> {
            //Use this method when there's pre-build code I want to change
            //E.g. String.compareTo is low to high, but I want High to low
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();

        });
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);// [ab, c, df, qwer]

        ts.comparator();


    }
}
