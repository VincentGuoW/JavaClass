package A202503Mar2025.Class02;

import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        System.out.println();
        TreeSet<Student> st = new TreeSet<>();
        Student s1 = new Student("B", 23);
        Student s2 = new Student("Aaa", 12);
        Student s3 = new Student("C", 32);
        Student s4 = new Student("A", 66);
        Student s5 = new Student("Az", 6);
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        System.out.println(st);
    }
}
