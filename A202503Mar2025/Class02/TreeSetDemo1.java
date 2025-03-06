package A202503Mar2025.Class02;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;


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


        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) { 
            System.out.println(it.next());
        }

        for (Integer i : ts) {
            System.out.println(i);
        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        ts.forEach(i->System.out.println(i));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        ts.forEach(System.out::println);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t); }
            
        });
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        ts.forEach((Integer t)-> {System.out.println(t);});
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        ts.forEach( t-> System.out.println(t));


    }
}
