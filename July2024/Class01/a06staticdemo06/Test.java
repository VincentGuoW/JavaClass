package July2024.Class01.a06staticdemo06;


public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.getPrintDad();
        son.testIt();//testIt in Dad class is public static, we can use it but it's not ideal
        son.getA();
        //
    }
}
