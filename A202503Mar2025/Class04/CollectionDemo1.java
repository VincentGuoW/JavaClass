package A202503Mar2025.Class04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Tom", 12);
        map.put("Sam", 23);
        map.put("Henry", 17);
        map.put("LU", 8);

        Set<String> keyString = map.keySet();
        System.out.println(keyString);
        for (String eachKey : keyString) {
            System.out.println(eachKey);
        }
        
        Map<Integer,Integer> map2 = new HashMap<>();
        map2.put(12, 12);
        map2.put(16, 23);
        map2.put(11, 17);
        map2.put(14,8);
        Set<Integer> keyString2 = map2.keySet();
        for (Integer key : keyString2) {
            System.out.println("KEY:  "+key);

            Integer value = map2.get(key);
            System.out.println("Value:  "+value);
        }

    }
}
