package A2408Aug2024.Class07;

public class SonDemo extends DadDemo {

    public SonDemo() {
    }

    public SonDemo(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("This is the son override");
        
    }
    
}
