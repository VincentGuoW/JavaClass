package A2408Aug2024.Class08Plus;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        DogDemo d = new DogDemo("Woof",12);
        System.out.println("NAME: " + d.getName());
        System.out.println("Age: " + d.getAge());
        d.eat();
        d.drink(d);
        System.out.println();

        FrogDemo f = new FrogDemo("Guuua",1);
        System.out.println("NAME: " + f.getName());
        System.out.println("Age: " + f.getAge());
        f.eat();
        f.drink(f);
        System.out.println();

        SheepDemo s = new SheepDemo("Meeeea",3);
        System.out.println("NAME: " + s.getName());
        System.out.println("Age: " + s.getAge());
        s.eat();
        s.drink(s);
        System.out.println();

    }
}
