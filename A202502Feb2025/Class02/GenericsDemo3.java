package A202502Feb2025.Class02;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        //Generics can not be extends

        ArrayList<Grandpa> listGrandpa = new ArrayList<>();
        ArrayList<Dad> listDad = new ArrayList<>();
        ArrayList<Son> listSon = new ArrayList<>();

        method(listGrandpa);
        //method(listDad); Error:  extends not work for generics
        //method(listSon); Error:  extends not work for generics

        listGrandpa.add(new Dad());
        listGrandpa.add(new Son());
        method(listGrandpa);
        //If we add extends data inside first it will work.

    }

    public static void method(ArrayList<Grandpa> list) {

    }
}

class Grandpa {
};

class Dad extends Grandpa {
};

class Son extends Dad {
};
