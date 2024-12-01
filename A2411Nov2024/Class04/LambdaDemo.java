package A2411Nov2024.Class04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LambdaDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        Iterator<String> it = list.iterator();

        for(String s : list ){
            System.out.println(s);
        }
        //Fast way to do it ==> list.for ==> TAB
        
        list.forEach(null);
        

    }
}
