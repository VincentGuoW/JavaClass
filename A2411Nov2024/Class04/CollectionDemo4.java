package A2411Nov2024.Class04;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println(it.next());
            it.remove();
        }

        System.out.println("The new list: " + list);
    }
}
