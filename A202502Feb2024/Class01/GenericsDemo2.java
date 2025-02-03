package A202502Feb2024.Class01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo2 {
    public static void main(String[] args) {
        //Best way to set up type from beginning.
        //E.g.
        //ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("aaa");
        //arrayList.add(111);
        //arrayList.add(new Student("name",12,"CS")); test

        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String)it.next();
            int strLength = str.length();
            System.out.println(strLength);

        }
    }
}
