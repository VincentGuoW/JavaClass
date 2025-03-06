package A202503Mar2025.Class03;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int mandarin;
    private int math;
    private int english;

    public Student() {
    }

    public Student(int age, int english, int mandarin, int math, String name) {
        this.age = age;
        this.english = english;
        this.mandarin = mandarin;
        this.math = math;
        this.name = name;
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

    public int getMandarin() {
        return mandarin;
    }

    public void setMandarin(int mandarin) {
        this.mandarin = mandarin;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + mandarin;
        result = prime * result + math;
        result = prime * result + english;
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
        if (mandarin != other.mandarin)
            return false;
        if (math != other.math)
            return false;
        if (english != other.english)
            return false;
        return true;
    }

    @Override
    public int compareTo(Student other) {
        int totalThisGrade = this.getMandarin() + this.getMath() + this.getEnglish();
        int totalOtherGrade = other.getMandarin() + other.getMath() + other.getEnglish();
        if (totalThisGrade != totalOtherGrade) {
            return  totalOtherGrade- totalThisGrade;
        } else if (this.getMandarin() != other.getMandarin()) {
            return  other.getMandarin()- this.getMandarin();
        } 
        else if (this.getMath() != other.getMath()) {
            return  other.getMath() - this.getMath() ;
        } 
        else if (this.getEnglish() != other.getEnglish()) {
            return  other.getEnglish() - this.getEnglish();
        } 
        else if (this.getAge() != other.getAge()) {
            return other.getAge() - this.getAge() ;
        } 
        else if (!this.getName().equals(other.getName())) {
            return other.getName().compareTo(this.getName());
        } 
        return 0;
    }

    @Override
    public String toString() {
        return "Student{"+this.getName()+" ; "+this.getAge()+" ; "+this.getMandarin()+" ; "+this.getMath()+" ; "+this.getEnglish()+" ; "+"}";
    }

    
}
