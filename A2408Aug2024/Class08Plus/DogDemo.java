package A2408Aug2024.Class08Plus;

public class DogDemo extends AnimalDemo {

    public DogDemo() {
    }


    public DogDemo(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("Dog eat bones");
        
    }

    public void drinkWater(){
        System.out.println("Dog drink water");
    }
}
