package A202503Mar2025.Class03;

import java.util.TreeSet;

/*
 * Request: 5 student list with follw rules
 *      1. Total score high to low
 *      2. If total score the same => Mandarin high to low
 *      3. If Mandarin score the same => Math high to low
 *      4. If Math score the same => English high to low
 *      5. If English score the same => Age high to low
 *      5. If AGE the same => Name char high to low
 */
public class TreeSetExercise1 {
    public static void main(String[] args) {
        /*
         * ArrayList ==> Most basic & common
         * HashSet   ==> One and only, no repeat
         * TreeSet   ==> One and only; And need in order
         */
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student(20, 100, 100, 100, "AAC");
        Student s2 = new Student(21, 100, 100, 100, "AAB");
        Student s3 = new Student(20, 100, 100, 100, "AAE");
        Student s4 = new Student(21, 100, 100, 100, "ACE");
        Student s5 = new Student(20, 100, 100, 100, "BAA");
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //System.out.println(ts);
        //ts.forEach( s-> System.out.println(s));
        ts.forEach( System.out::println);
    }
}
