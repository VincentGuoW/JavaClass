package A2408Aug2024.Class08;

public class SheepDemo extends AnimalDemo {

    public SheepDemo() {
    }

    public SheepDemo(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Sheep eat grass");
        
    }
}
