package A202503Mar2025.Class04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //RQ1: Loop the map use "for" 
        //RQ2: Loop the map use "consider"
        //RQ3: Loop the map use "lambda"

        Map<String,String> map = new HashMap<>();
        map.put("Tom", "Henry");
        map.put("Kevin", "Jason");
        map.put("Lu", "Kart");
        map.put("Iris", "Vector");

        System.out.println("MAP : "+map);
        
        Set<String> keySet = map.keySet();
        System.out.println("Key Set :  "+keySet);
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println("{"+key+","+value+"}");
        }

        System.out.println("--------------------");

        Set<String> keySet2 = map.keySet();
        Iterator<String> it = keySet2.iterator();
        while (it.hasNext()) { 
            String value =map.get(it);
            System.out.println("{"+keySet2+","+value+"}");
        }
    
    
        Set<String> keySet3 = map.keySet();
        keySet3.forEach( key-> {System.out.println("{"+key+","+map.get(key)+"}");});
    
    
        keySet3.forEach(new Consumer<String>() {
            //
            @Override
            public void accept(String t) {
            }
            
        });
    
    }



}
