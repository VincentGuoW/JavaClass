package A2408Aug2024.Class09;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Vincent",1);
        System.out.println(d.getName()+" , " + d.getAge());
        d.eat();
        d.swim();

        Rabbit r = new Rabbit("Henry",2);
        System.out.println(r.getName()+" , " + r.getAge());
        r.eat();
        //r.swim();
    }
}
