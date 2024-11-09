package A2411Nov2024.Class04;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    /*
     test
     * public boolean add (E e)
     * public void clear()
     * public boolean remove(E e)
     * public boolean contains (Object obj)
     * public boolean isEmpty()
     * public int size()
     * 
     */
    public static void main(String[] args) {
        System.out.println();
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll.add("aaa"));
        System.out.println(coll.add("bbb"));
        System.out.println(coll.add("ccc"));
        System.out.println(coll);
        System.out.println(coll.remove("aaa"));
        System.out.println(coll);
        System.out.println("Contains: ==> "+coll.contains("bbb"));
        coll.clear();
        System.out.println(coll);
    }
}
