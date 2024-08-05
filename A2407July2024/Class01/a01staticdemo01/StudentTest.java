package July2024.Class01.a01staticdemo01;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName="Vincent";
        Student s1 = new Student();
        s1.setName("sam");
        s1.setAge(12);
        s1.setGender("Male");;
        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("t");
        s2.setAge(121);
        s2.setGender("t");
        s2.study();
        s2.show();
    }
}
