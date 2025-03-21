package A202503Mar2025.Class07;

public class Student implements Comparable<Student>{
    private  String name;
    private  int age;
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
    @Override
    public int compareTo(Student otherStudent) {
        if(this.getAge()!=otherStudent.getAge()){
            return this.getAge()-otherStudent.getAge();
        }
        else if (!this.getName().equals(otherStudent.getName())) {
            return this.getName().compareTo(otherStudent.getName());
        }else{
            return 0;
        }
        
    }

    @Override
    public String toString() {
        return "{ "+this.getName() + " ; " + this.getAge()+" }";
    }
    
    
}
