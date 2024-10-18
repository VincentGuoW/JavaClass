package A2410Oct2024.Class04;

public class Girlfriend {
    private String name;
    private double age;
    private double height;

    
    public Girlfriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Girlfriend() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
}
