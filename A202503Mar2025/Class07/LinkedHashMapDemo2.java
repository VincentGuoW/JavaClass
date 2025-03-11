package A202503Mar2025.Class07;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("AAA", 123);
        lhm.put("BBB", 234);
        lhm.put("CCC", 456);
        lhm.put("AAA", 789);
        lhm.put("DDD", 890);

        System.out.println(lhm);
        //{AAA=789, BBB=234, CCC=456, DDD=890}
        /*
         * 1. It was in order, AAA in first it will remain that way
         * 2. Same entry, new entry replace old entry from the same spot
         *          E.g. AAA was 123, the new AAA with 789 will replace AAA
         * from the first place. The result still start with AAA but diff value.
         * 
         */
    }
}
