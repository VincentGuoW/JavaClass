package A202503Mar2025.Class05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        System.out.println();
        // Second Method to loop the map
        // Use the entry --> to loop the map

        Map<String, String> m = new HashMap<>();
        m.put("First", "Tom");
        m.put("Sec", "Sam");
        m.put("Third", "Eddi");
        m.put("Fourth", "Leo");
        m.put("Fifth", "Kent");

        Set<Map.Entry<String, String>> entrysForM = m.entrySet();

        Iterator<Map.Entry<String, String>> it = new Iterator<Map.Entry<String, String>>() {

            @Override
            public boolean hasNext() {
                return this.hasNext();
            }

            @Override
            public Entry<String, String> next() {
                return this.next();
            }

        };

        Iterator<Map.Entry<String, String>> it2 = entrysForM.iterator();
        // Since we import Map.Entry==> Just use Entry<x,y> is fine
        Iterator<Entry<String, String>> it3 = entrysForM.iterator();

        while (it2.hasNext()) {
            Map.Entry<String, String> mEntry = it2.next();
            System.out.println();
            System.out.print("{ ");
            System.out.print(mEntry.getKey());
            System.out.print(" : ");
            System.out.print(mEntry.getValue());
            System.out.print("}");
            System.out.println();

        }

        for (Entry<String, String> entry : entrysForM) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        entrysForM.forEach(entry -> {
            System.out.println(entry.getKey() + " ; " + entry.getValue());
        });
        System.out.println("_______________________");
        m.forEach(new BiConsumer<String,String>() {

            @Override
            public void accept(String key, String value) {
               System.out.println("{ "+key + " ; " + value +" }");
            }
            
        });
        System.out.println("-----------------------");
        m.forEach((String key, String value)-> {
                System.out.println("{ "+key + " ; " + value +" }");
            
            
        });


    }

}
