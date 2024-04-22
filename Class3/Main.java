package Class3;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(Cats.getCatCount());

        Cats myCats = new Cats();
        myCats.meow();
        myCats.name = "Vincent";
        myCats.age = 18;

        System.out.println(Cats.getCatCount());
    }
}
