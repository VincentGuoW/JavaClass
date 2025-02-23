package A202502Feb2024.Class03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<WhiteCat> listCat = new ArrayList<>();
        listCat.add(new WhiteCat());
        ArrayList<BlackDog> listDog = new ArrayList<>();
        listDog.add(new BlackDog());
        ArrayList<BlackCat> listCatB = new ArrayList<>();
        listCatB.add(new BlackCat());

        
        //keep1 cat only
        keepPet1(listCat);
        keepPet1(listCatB);
        
        //keepPet1(listDog);

        //Keep2 dog only
        //keepPet2(listCat);
        keepPet2(listDog);

        //Keep3 cat + dog but no other type
        keepPet3(listCat);
        keepPet3(listDog);
        //keepPet3("String");


        
    }

    public static void keepPet1(ArrayList<? extends Cat>list){
        for (Cat cat : list) {
            cat.eat();
        }
    }
    public static void keepPet2(ArrayList<? extends Dog>list){}
    public static void keepPet3(ArrayList<? extends Animal>list){}
}
