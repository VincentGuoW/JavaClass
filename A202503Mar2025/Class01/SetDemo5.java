package A202503Mar2025.Class01;

import java.util.HashSet;

public class SetDemo5 {
    public static void main(String[] args) {
        System.out.println();
        //Organize students==> If same value consider same student.
        Student2 s1 = new Student2("Tom",12);
        Student2 s2 = new Student2("Sam",24);
        Student2 s3 = new Student2("Henry",23);
        Student2 s4 = new Student2("Sam",24);
        Student2 s5 = new Student2("Billy",56);

        HashSet<Student2> hs = new HashSet<>();
        boolean sr1=hs.add(s1);
        boolean sr2=hs.add(s2);
        boolean sr3=hs.add(s3);
        boolean sr4=hs.add(s4);
        boolean sr5=hs.add(s5);

        System.out.println(sr1);
        System.out.println(sr2);
        System.out.println(sr3);
        System.out.println(sr4);
        System.out.println(sr5);
        
        System.out.println(hs);
        
    }
}
