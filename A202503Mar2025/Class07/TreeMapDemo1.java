package A202503Mar2025.Class07;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*
         * RQ Use TreeMap ==> Key for ID int ; Value for product name
         * ORDER ==> ID low to hight & high to low.
         */

         TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
            
         });


         tm.put(123, "AAA");
         tm.put(223, "BBB");
         tm.put(421, "CCC");
         tm.put(111, "DDD");
         tm.put(3432, "EEEAEEEAA");

         System.out.println(tm);

         Student s1 = new Student("TOM",12);
         Student s2 = new Student("SAM",12);
         Student s3 = new Student("LUO",12);
         Student s4 = new Student("GIT",12);
         Student s5 = new Student("TOM",12);
         
         TreeMap<Student,String> tm2 = new TreeMap<>();
         tm2.put(s1, "AAA");
         tm2.put(s2, "AAA");
         tm2.put(s3, "AAA");
         tm2.put(s4, "AAA");
         tm2.put(s5, "AAA");

         System.out.println(tm2);
    }
}
