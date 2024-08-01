package July2024.Class01.a05staticdemo05;

public class Pet {
    public void eat(){
        System.out.println("Eat");
    }
    public void drink(){
        System.out.println("Drink");
    }
    
    private void test(){
        System.out.println("This is private");
    }

    public void callTest(){
        test();
    }
}
