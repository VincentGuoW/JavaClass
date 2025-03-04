package A202503Mar2025.Class01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo2 {

    public static void main(String[] args) {
        System.out.println();
        Set<String> s = new HashSet<>();
        boolean r1 = s.add("Tom");
        boolean r2 = s.add("Henry");
        boolean r3 = s.add("Tom");
        s.add("1");
        s.add("2");
        s.add("3");
        System.out.println(s);

        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        for (String str : s) {
            //Just the same as iterator, easy to read(Use Iterator in the back)
            System.out.println(str);
        }

        // s.forEach(new Consumer<String>() {
        // @Override
        // public void accept(String str) {
        // System.out.println(str);
        // }
        // });
        s.forEach(str -> System.out.println(str));
        s.forEach(System.out::println);

        s.stream().forEach(System.out::println);
    }
}
