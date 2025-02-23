package A202502Feb2024.Class02;

import java.util.ArrayList;

public class GenericsDemo7 {
    //Another major idead for <?>
        //1. extends  ==>  <? extends XXXclass>
        //2. super    ==>  <? super   xxxclass>
    public static void main(String[] args) {
        ArrayList<Grandpa> gpaList = new ArrayList<>();
        ArrayList<Father> dadList = new ArrayList<>();
        ArrayList<Son> sonList = new ArrayList<>();
        method2(sonList);
        method3(gpaList);
    }
    public static<E> void method1(ArrayList<E> list){

    }
    //extends ==> itself and all the childends
    public static void method2(ArrayList<? extends Grandpa> list){
        
    }

    //super  ==> itself and all the partends and grandparents
    public static void method3(ArrayList<? super Grandpa> list){

    }
}

class Grandpa{}
class Father extends Grandpa{}
class Son extends Father{}