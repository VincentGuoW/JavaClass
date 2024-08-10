package A2408Aug2024.Class09;

public abstract class Animal {
    private String name;
    private int age;
    public Animal() {
    }
    public Animal(String name, int age) {
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
    //abstract in the Dad class => all the son class need it
    
}
