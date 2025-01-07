package A202501Jan2025.Class02;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class LinkListDemo1 {
    public static void main(String[] args) {
        /*
        Only LinkedList has the following API:

        *** addFirst(E e)
        *** addLast(E e)
        *** getFirst()
        *** getLast()
        *** removeFirst()
        *** removeLast()
        

        */

        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        list.addFirst("ddd");

        System.out.println(list);
    }
}
