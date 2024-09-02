package A2409Sep2024.Class01;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
    
    @Override
    public String toString() {
        return super.getName()+" , " + super.getAge();
    }
}
