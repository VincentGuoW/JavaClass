package A2411Nov2024.Class04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        /*
        1. If empty and force to use iterator will get ==> NoSuchElementException
        2. Pointer will not return after iterator 
        3. while loop can only use next() once each loop
        4. when iterator, can use array method for add or remove
        test
         */
        Collection <String> coll = new ArrayList<>();
        //
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(null);  
        coll.add("ddd");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            
            System.out.println(it.next());
        }    
    }
}
