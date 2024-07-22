package July2024.Class01.a04staticdemo04;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println();
        Student.teacherName="VINcent";

        Student s1 = new Student();
        s1.name = "TOM";
        s1.age = 23;
        s1.infoShow();

        Student s2 = new Student();
        s2.name = "HENRY";
        s2.age = 24;
        s2.infoShow();
    }
}
