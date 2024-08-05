package July2024.Class02.StaticDemo3;

public class Cat extends Pet {
    @Override
    public void eat(String food) {
        System.out.println( this.getAge() +"years old "+this.getColor()+" cat eat a little of" + food);
    }

    public void catchMouse(){
        System.out.println("Cat can catch mouse");
    }
}
