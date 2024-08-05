package July2024.Class02.StaticDemo3;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println( this.getAge() +"years old "+getColor()+" dog eat a lot of" + food);
    }

    public void homeSecurity(){
        System.out.println("Dog can help with home security");
    }
}
