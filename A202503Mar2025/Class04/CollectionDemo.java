package A202503Mar2025.Class04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionDemo {
    /*
     * Two column collection--> Entry (Key & Value)
     *  1. two column collection each time will have two entry ( key and value)
     *  2. key can't repeat but value is fine
     *  3. each key have thier own value
     *  4. key+value ==> entry object
     */
    public static void main(String[] args) {
        /*
         *           |--- HashMap----LinkedHashMap
         *           |
         *      Map--|
         *           |
         *           |--- TreeMap
         * 
         * · put()
         * · remove()
         * · clear()
         * · containsKey()
         * · containsValue()
         * · isEmpty()
         * · size()
         */
         
         
         //Map<String,Integer> map = new Map<>(); Map is interfa, can't new map
         Map<String,Integer> map1 = new HashMap<>();//HashMap<>()==> public class
         Map<String,Integer> map2 = new TreeMap<>();//TreeMap<>()==> public class
         Map<String,Integer> map3 = new LinkedHashMap<>();//LinkedHashMap<>()==> public class

         Integer value1 = map1.put("Tom", 15);
         map1.put("Sam", 12);
         map1.put("Henry", 52);
         map1.put("Lisa", 12);
         Integer value2 = map1.put("Tom", 12);
         System.out.println(value1);//null
         System.out.println(value2);//15--> Alreay have a Tom, recover the value


         Integer value3 = map1.remove("Tom");
         System.out.println(value3);//12 the latest Tom value is 12

         Boolean isEmpty1 = map1.isEmpty();
         System.out.println("Is Empty: " + isEmpty1);
         int mapSize1 = map1.size();
         System.out.println("Map Size: " + mapSize1);

         System.out.println(map1);//{Tom=12, Sam=22, Henry=52, Lisa=12}
         //New value replace old value, and key must be one and only


         boolean result1 = map1.containsKey("Tom");// False ==> no more Tom; removed
         boolean result2 = map1.containsKey("Sam");// Ture ==> we have Sam
         boolean result3 = map1.containsValue(15);// False ==> no 15 value
         boolean result4 = map1.containsValue(12);// True ==> Yes, and more than one 12 value;
         System.out.println("{"+result1+" ; "+result2+" ; "+result3+" ; "+result4+" ; "+"}");

         map1.clear(); //Nothing left
         System.out.println(map1);//{}
         Boolean isEmpty2 = map1.isEmpty();
         System.out.println("Is Empty: " + isEmpty2);
         int mapSize2 = map1.size();
         System.out.println("Map Size: " + mapSize2);
    }
}
