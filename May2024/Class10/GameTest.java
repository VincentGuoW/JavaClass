package May2024.Class10;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("SAM",100);
        Role r2 = new Role("TOM",100);

        while (true) {
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName() + " KO " +r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName() + " KO " +r1.getName());
                break;
            }
        }
    }
}
