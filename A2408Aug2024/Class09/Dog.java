package A2408Aug2024.Class09;

public class Dog extends Animal implements Swim {
    public Dog() {
    }
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("DOG EAT");
        
    }
    @Override
    public void swim() {
        System.out.println("DOG SWIM");
        
    }
}
