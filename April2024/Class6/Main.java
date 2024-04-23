package Class6;

public class Main {
    public static void main(String[] args){
        Hero hero1 = new Hero(1, true);
        Hero hero2 = new Hero(100, false);

        System.out.println("Hero level:" + hero1.level);
        System.out.println("Hero is free:"+ hero1.isFree);
        System.out.println("Hero level:"+ hero2.level);
        System.out.println("Hero is free:"+hero2.isFree);
    }
}
