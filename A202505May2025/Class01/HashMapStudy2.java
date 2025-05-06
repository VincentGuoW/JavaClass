package A202505May2025.Class01;

public class HashMapStudy2 {
    public static void main(String[] args) {
        System.out.println("Test");
        /*
        HashMap() method==> 
            compute() 
                1.extends  (keep the same)
                2.override (write sth diff)
        
        static final with capital letter class == CONSTANT!!!
        e.g. 
            Math.PI   Integer.MAX_VALUE
        They all use captial letter, with the value that can NOT change!!
        
        
        
        */

        
        
    }

    class Animal {
        void sound(){};
        //abstract void sound2(); error, abstract method must under abstract class

    }
    abstract class Animal2 {
        abstract void sound3();
    }

    class Dog extends Animal{
        //@Override
        //void sound() {
        //    // TODO Auto-generated method stub
        //    super.sound();
        //}
    }

    class Dog2 extends Animal2{
        //Animal2 is abstract class. Must overide the method
        //Help prevent missing method
        @Override
        void sound3() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'sound3'");
        }
        
    }


    interface Animal3{
        void sound();
    }

    class Dog3 implements Animal3{
        @Override
        public void sound() {
            // TODO Auto-generated method stub
            
        }
    }

    abstract class Dog4 implements Animal3{
        //abstract class doesn't have to override
        //But his son must override Animal3 's class
    }

    class DogSmall extends Dog4{

        @Override
        public void sound() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'sound'");
        }
        
    }
}
