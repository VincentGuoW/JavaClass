package A202503Mar2025.Class07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo1 {
    // Linked HashMap ==> In order, no repeat, no index
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Tom", 12);
        lhm.put("Sam", 32);
        lhm.put("Lee", 54);
        lhm.put("Leo", 22);
        lhm.put("Git", 66);

        Set<Entry<String, Integer>> lhmEntry = lhm.entrySet();
        for (Entry<String, Integer> entry : lhmEntry) {
            System.out.println("{" + entry.getKey() + " ; " + entry.getValue() + "}");
        }
        System.out.println("--------------------");
        Set<String> lhmKey = lhm.keySet();
        for (String key : lhmKey) {
            int value = lhm.get(key);
            System.out.println("{" + key + " ; " + value + "}");
        }
        System.out.println("--------------------");
        Iterator<Entry<String, Integer>> it = lhmEntry.iterator();
        while (it.hasNext()) {
            Entry<String, Integer> result = it.next();

            System.out.println("{" + result.getKey() + " ; " + result.getValue() + "}");
        }
        System.out.println("--------------------");
        lhmEntry.forEach((Entry<String, Integer> result) -> {
            System.out.println("{" + result.getKey() + " ; " + result.getValue() + "}");
        });
    }
}
