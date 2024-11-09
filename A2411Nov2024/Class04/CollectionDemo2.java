package A2411Nov2024.Class04;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {

    public static void main(String[] args) {
        System.out.println();
        Collection<Student> coll = new ArrayList<>();
        Student s1 = new Student("SAM", 21);
        Student s2 = new Student("TOM", 22);
        Student s3 = new Student("LEE", 23);
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        //If create s4.equals s1, and c if coll has s4 inside ==>
        Student s4 = new Student("SAM", 21);
        
        
        //Was false, before I rewrite Student.equals
        //contains is under ArrayList, and they use equals
        //System.out.println(coll.contains(s4));//False
        System.out.println(coll.contains(s4));//true

        System.out.println("Is Empty: " + coll.isEmpty());
        System.out.println("Size: " + coll.size());

    }
}
