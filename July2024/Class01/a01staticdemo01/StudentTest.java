package July2024.Class01.a01staticdemo01;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("sam");
        s1.setAge(12);
        s1.setGender("Male");
        s1.study();
        s1.show();
    }
}
