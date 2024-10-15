package A2410Oct2024.Class03;

public class LambdaDemo {
    public static void main(String[] args) {
        //Lambda for Anonymous Inner Class
        //For interface
        //Check with @Functionalinterface
        method(new Swim() {
            @Override
            public void swimming(){
                System.out.println("I'm swimming 1");
            }
        });

        method(
            ()->
            System.out.println("I'm swimming 2")
        );

        /* 
        Lambda can only be use on functional interface(only one abstract method)
        method(new Swim2() {
            @Override
            public void swimming2(){
                System.out.println("I'm swimming2 2");
            }
        });
        */
        
    }
    /*
    Better way to use interface 
        public static void method implements Swim(){...}
            @Override all method inside Swim
        public static void method(Swim s){...}
            Use the only part you need
    */

    public static void method(Swim s){
        s.swimming();
    }
    @FunctionalInterface
    interface Swim{
        public abstract void swimming();
    }

    //This is NOT a Functional Interface
    interface Swim2{
        public abstract void swimming();
        public abstract void swimming2();
    }
}
