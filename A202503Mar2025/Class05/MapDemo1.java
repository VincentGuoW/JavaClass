package A202503Mar2025.Class05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo1 {
    public static void main(String[] args) {
        System.out.println();
        //First Method to loop the map
        //keySet --> Use key set to loop the map

        Map<String,String> m = new HashMap<>();
        m.put("First", "Tom");
        m.put("Sec", "Sam");
        m.put("Third", "Eddi");
        m.put("Fourth", "Leo");
        m.put("Fifth", "Kent");

        Set<String> keysForM = m.keySet();

        keysForM.forEach(key->  System.out.println("{"+key+" ; " + m.get(key)+"}"));
    }
}
