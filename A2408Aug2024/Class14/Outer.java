package A2408Aug2024.Class14;

public class Outer {
    String name;
    public class Inner{
        static int a = 10;
    }
    private class Inner2{

    }
    public Inner2 getInner2(){
        return new Inner2();
    }
}
