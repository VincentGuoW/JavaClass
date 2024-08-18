package A2408Aug2024.Class16;

public class Test {
    public static void main(String[] args) {
        
        new Swim() {
            @Override
            public void swim() {
              System.out.println("This is override swim");
            }
            
        }.swim();

        new Animal(){

            @Override
            public void eat() {
                System.out.println("Eat smt");
            }

        };

        methods(
            new Animal() {

                @Override
                public void eat() {
                 }
            
            }
            
        );

        
        
        
    }
    public static void methods(Animal a){
        a.eat();
    };
}
