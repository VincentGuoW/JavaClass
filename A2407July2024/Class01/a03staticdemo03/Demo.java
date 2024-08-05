package July2024.Class01.a03staticdemo03;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<Student> students = new ArrayList<Student>();
        Student st1 = new Student("Tom",112,"Male");
        Student st2 = new Student("Tom",23,"Female");
        Student st3 = new Student("Henry",34,"Male");
        students.add(st1);
        students.add(st2);
        students.add(st3);

        System.out.println(UtilityMaxAge.getMaxAge(students));
    }
}
