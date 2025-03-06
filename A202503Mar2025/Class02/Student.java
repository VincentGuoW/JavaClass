package A202503Mar2025.Class02;

//public class Student implements Comparable<Student>{

import java.util.Objects;

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

    String s ="";

    @Override
    public int compareTo(Student other) {
        //return this.name.compareTo(other.name); 
                //Used String.compareTo(String x)
                //Return each char ASCII and find the lower int
        //return this.age-other.age;
        return this.getAge()-other.getAge();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.age != other.age) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    
}
