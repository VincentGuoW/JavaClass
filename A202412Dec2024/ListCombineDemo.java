package A202412Dec2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListCombineDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for (String eachElement : list) {
            System.out.println(eachElement);
        }

        list.forEach( s-> System.out.println(s));
      
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ListIterator
       
    }
}
