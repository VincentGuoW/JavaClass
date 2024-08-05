package April2024.Class3;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(Cats.getCatCount());

        //Because Cats() in this case is not static, so we need new instance to use it.
        Cats myCats = new Cats();
        // Cats --> Class!! 類
        // myCats --> Object!! 對象  / Instance 實例
        // new Cats() --> Initiallization!! (start building a new object from class)
        myCats.meow();
        myCats.name = "Vincent";
        myCats.age = 18;

        Cats.getCatCount();
            //!!!!!!!!This is important!!!!!!!!//
            // getCatCount() and meow()
            // getCatCount()     -->     public static int getCatCount()
            // meow()            -->     public void meow()
            // If it's static, you can just use Cats.xxxxx().
            // If it's non-static, you must make new Instance/Object first.
            //     Then use the new Instance/Object.
            //     Cats myCats(new object) = new Cats();  
            //     myCats.meow()  

            //!!!!!!!!This is important!!!!!!!!//
        System.out.println(Cats.maxLives);//maxLives is static, able to use.
        //System.out.println(Cats.name);//Name is not static, unable to use.

        System.out.println(Cats.getCatCount());
        //System.out.println(myCats.getCatCount());
    }
}
