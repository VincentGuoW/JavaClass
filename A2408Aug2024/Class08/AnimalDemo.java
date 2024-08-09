package A2408Aug2024.Class08;

public abstract class AnimalDemo {
    private String name;
    private int age;
    public AnimalDemo() {
    }
    public AnimalDemo(String name, int age) {
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
    public abstract void eat();
    
    public void drink(){
        System.out.println("Animal Drink water");
    }

    
}
