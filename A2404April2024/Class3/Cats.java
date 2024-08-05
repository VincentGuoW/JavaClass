package April2024.Class3;


//Think of Cats, this class is a blue print, 
//It can use for millions of cats, not just one.




public class Cats {
    public static final int maxLives = 9;

    private static int catsCount = 0;

    String name;

    int age;

    int liveRemaining;


    public void meow(){
        System.out.println("MEOOOOOW");
    }

    public Cats(){
        catsCount++;
        liveRemaining = maxLives;
    }

    public static int getCatCount(){
        //System.out.println(age); 
        //This sample is wrong. 
        //static can not use non-static reference.
        return catsCount;
    }
}
