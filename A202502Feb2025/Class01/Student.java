package A202502Feb2025.Class01;

public class Student {
    private String name;
    private int age;
    private String program;
    public Student() {
    }
    public Student(String name, int age, String program) {
        this.name = name;
        this.age = age;
        this.program = program;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
}
