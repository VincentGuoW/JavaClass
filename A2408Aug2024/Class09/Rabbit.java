package A2408Aug2024.Class09;

public class Rabbit extends Animal  {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Rabbit eat carrot");
    }
}
