package A202503Mar2025.Class01;

import java.util.LinkedHashSet;

public class SetDemo6 {
    public static void main(String[] args) {
        /*
         * Linked Hash Set:
         * 
         * ***Just like Hash set but not signle link, doubly linked
         * ***Linked HashSet won't change to redblack tree 
         *    even Linked list >8  && index of the array >64
         * 
         * 
         * When use it
         *      1. One and only + In order == Linked HashSet
         *      2. One and only + order doesn't matter == HashSet
         */

        /*
         * 
         * Array    0   1   2   3   4   5   6   7   ... 15
         *          |           |           |
         *          |          / \          |
         *          C         A   B         D
        
        
        
            HashSet get    ==>   C -> A -> B -> D
            Linked HashSet ==>   A -> B -> C -> D
            
            Reason:
            Linked HashSet has doubly linked:
            E.g. When input they will record befor and after address
                | location null  ||  A  || location B     |  
                | location A     ||  B  || location C     |  
                | location B     ||  C  || location D     |  
                | location C     ||  D  || location null  | 
         */

         Student2 s1 = new Student2("Tom",12);
         Student2 s2 = new Student2("Sam",24);
         Student2 s3 = new Student2("Henry",23);
         Student2 s4 = new Student2("Sam",24);
         Student2 s5 = new Student2("Billy",56);

         LinkedHashSet<Student2> linkhs = new LinkedHashSet<>();
         linkhs.add(s1);
         linkhs.add(s2);
         linkhs.add(s3);
         linkhs.add(s4);
         linkhs.add(s5);

         System.out.println(linkhs); // Tom Sam Henry Billy ==> in order

        System.out.println("SetDemo6.main()");
    }
}
