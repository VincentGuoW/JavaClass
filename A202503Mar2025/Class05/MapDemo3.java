package A202503Mar2025.Class05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class MapDemo3 {
    public static void main(String[] args) {
        System.out.println();

        Map<String, Integer> m = new HashMap<>();
        m.put("First", 11);
        m.put("Sec", 3);
        m.put("Third", 6);
        m.put("Fourth", 9);
        m.put("Fifth", 43);

        m.forEach((key, value) -> System.out.println("{ " + key + " ; " + value + " }")
        );

        //Set<Entry<String,Integer>> entrySetAll  = m.entrySet();
        for (Entry<String,Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey()+ " ; " + entry.getValue());
        }

        Set <Entry<String,Integer>> setEntries = m.entrySet();
        Iterator<Entry<String, Integer>> it = setEntries.iterator(); {
            while (it.hasNext()) {
                Entry<String, Integer> result = it.next();
                System.out.println(result.getKey()+" ; "+result.getValue());
            }
        };


    }
}
