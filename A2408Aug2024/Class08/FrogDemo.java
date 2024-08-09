package A2408Aug2024.Class08;

public class FrogDemo extends AnimalDemo {
    public FrogDemo() {
    }

    public FrogDemo(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("Frog eat bugs");
        
    }
}
