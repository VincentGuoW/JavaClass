package A2408Aug2024.Class08Plus;

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
    
    public void drink(AnimalDemo a){
        if(a instanceof DogDemo){
            
            ((DogDemo)a).drinkWater();//force animal change to a
        }
        else if (a instanceof FrogDemo){
            System.out.println("Frog water");

        }
        else if (a instanceof SheepDemo){
            System.out.println("Sheep water");
        }
        else{
            System.out.println("Instance of class is wrong");
        }
    }

    
}
