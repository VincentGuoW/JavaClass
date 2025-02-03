package A202502Feb2024.Class01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {
    public static void main(String[] args) {
        //It's fine to do it this way,
        
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add(111);
        arrayList.add(new Student("name",12,"CS"));

        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String)it.next();//Force to change type to String
            int strLength = str.length();
            System.out.println(strLength);

        }
        //But most time unable to force type casting
    }
}
