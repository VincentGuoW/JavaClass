package May2024.Class11;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("SAM",100,'M');
        Role r2 = new Role("TOM",100,'F');

        while (true) {
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName() + " KO " +r2.getName());
                System.out.printf("%s made a example", "vincent");
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName() + " KO " +r1.getName());
                System.out.printf("%s made a example", "vincent");
                break;
            }
        }
    }
}
