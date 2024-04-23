package Class4;

public class StaticStudy {
    public static void main(String args[]) {

        ClassA.x = 111;
        ClassA object1 = new ClassA();
        object1.y = 222222;
        object1.x = 111;

        ClassA.x = 333;
        ClassA object2 = new ClassA();
        object2.y = 4444444;
        object2.x = 333;

        System.out.println(ClassA.x);
        System.out.println(object1.x);
        System.out.println(object1.y);
        
        System.out.println(ClassA.x);
        System.out.println(object2.x);
        System.out.println(object2.y);

        //Check result: 
        //1. instance method need new instance/ojbect to carry the value.(ClassA object1 = new ClassA();)
        //2. static method can straight use it.(ClassA.x)
        //3. instance method will value at different spot !!!!
        //4. static method will save value at the same spot !!!!!! 
            //static--> (static method doesn't need new instance/project)
                //object1.x == ClassA.x
                //object2.x == ClassA.x
            //static method won't change seperatlly even with different instance/project!
    }
}
