package July2024.Class01.a06staticdemo06;

public class Dad extends Object{
    private int a;
    private int b;
    public Dad(){}
    public Dad(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public void getPrintDad(){
        printDad();
    }

    public static void testIt(){
        System.out.println("Test it");
    }

    private static void printDad(){
        System.out.println("This is private static dad");
    }
    
}
