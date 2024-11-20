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
     *  test issue
     */
    public static void main(String[] args) {
        System.out.println();
        Collection<String> coll = new ArrayList<>();
        /*
        Father: Collection
        Son: ArrayList
        
        1.Why using polymorphism?
            Polymorphism allows us to use a parent class (like Collection), 
            which is simple and has basic functions. 
            But we can't directly create an instance of Collection, 
            so we use a child class (like ArrayList) to store the data.

            By declaring it as Collection, we can still use all the basic 
            functions, but the actual data is stored in the ArrayList. 
            This gives us the flexibility to switch to other collection types 
            in the future without changing much code.

        2. If Collection and ArrayList both have same funciton:
            a. only use the method that Colleciton (parent) has.
            b. is ArrayList rewrite method from Collection (parent),
                use ArrayList rewrite method.
                    e.g.
                        Collection.print==>address
                            ArrayList rewrite print method
                        ArrayList.print==>name
                    The result will be name;
         */
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
