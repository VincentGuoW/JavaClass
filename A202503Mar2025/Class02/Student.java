package A202503Mar2025.Class02;

//public class Student implements Comparable<Student>{
public class Student  implements Comparable<Student> {
    private String name;
    private int age;

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

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{ "+name+";"+age+" }";
    }



    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    
}
