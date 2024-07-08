package July2024.Class01.a01staticdemo01;

public class Student {
    private String name;
    private int age;
    private String gender;

    public static String teacherName; // shear the same teacherName for all different student

    public Student() {
        
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(this.name + " is studying");
    }

    public void show(){
        System.out.println(this.name + " , " + this.age + " , " + this.gender + " , " + this.teacherName);
    }
}
