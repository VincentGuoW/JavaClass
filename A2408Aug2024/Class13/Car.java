package A2408Aug2024.Class13;

public class Car {
    String carName;
    int carAge;
    int carColor;
    //why we need inner class?
        //Engine class is meaning less just by itself.
        //We only need engine class when we have car class.
    public void showOut(Car this){
        System.out.println(this.carName);
        System.out.println(this.carAge);

        //System.out.println(engineName);
        //Use inner class is not working
        Engine e = new Car.Engine() {
            @Override
            public void show() {
                System.out.println(engineName);
            }
        };
        System.out.println(e.engineAge);
        e.show2();
            
    }
        
    

    public abstract class Engine {
        //With out public also fine.
        String engineName;
        int engineAge;
        //I tried abstract on this class.The inner class must change to abstract aswell;
        //But the outter class no need for it.
        public abstract void show();
        public void show2(){
            System.out.println("Show 2 engine name");
            System.out.println(engineName);
            System.out.println();
        }
    }
}

