package A202503Mar2025.Class06;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    /*
     * Creat a HashMap ==> Key->Student ; Value ->String
     * Save three entry and loop 
     * Rq: same name & age consider same student
     */
    public static void main(String[] args) {
        System.out.println();
        HashMap<Student,String> hm = new HashMap<>();
        Student st1 = new Student("TOM",12);
        Student st2 = new Student("SAM",13);
        Student st3 = new Student("LU",14);
        Student st4 = new Student("TOM",13);
        Student st5 = new Student("SAM",13);

        hm.put(st1, "AAA");
        hm.put(st2, "BBB");
        hm.put(st3, "CCC");
        hm.put(st4, "DDD");
        hm.put(st5, "EEE");

        Set<Map.Entry<Student,String>> hmSet = hm.entrySet();
        //for (Map.Entry<Student,String> entry : hm.entrySet()) {
        for (Map.Entry<Student,String> entry : hmSet) {
            System.out.println(" { "+entry.getKey().getName()+" ; " +entry.getKey().getAge() +" ; " + entry.getValue()+"  }");
        }

    }
}
