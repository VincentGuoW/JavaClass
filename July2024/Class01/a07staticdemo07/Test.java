package July2024.Class01.a07staticdemo07;

public class Test {
    public static void main(String[] args) {
        Huskey huskey = new Huskey();
        huskey.destory();
        huskey.eat();
        huskey.drink();
        huskey.watchOut();

        British british = new British();
        british.drink();
        british.eat();
        british.watchOut();

        Chinese chinese = new Chinese();
        chinese.drink();
        chinese.eat();
        chinese.watchOut();

        HuskySmall hs = new HuskySmall(10,10);
        hs.result();
    }
}
