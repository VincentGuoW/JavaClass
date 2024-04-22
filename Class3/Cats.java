package Class3;


//Think of Cats, this class is a blue print, it can use for millions of cats, not just one.




public class Cats {
    private static int catsCount = 0;

    String name;

    int age;

    int liveRemaining;


    public void meow(){
        System.out.println("MEOOOOOW");
    }

    public Cats(){
        catsCount++;
    }

    public static int getCatCount(){
        return catsCount;
    }
}
