package A202502Feb2024.Class01;

import java.util.ArrayList;

public  class ListUtil {
    private ListUtil(){};
    public static<E> void addAll1(ArrayList<E> list,E e1,E e2, E e3){
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }
    public<E> void show1(ArrayList<E> list){
        System.out.println("It's done 1");
    }
    public void show2(){
        System.out.println("It's done 2");
    }
    public static<E> void addAll2(ArrayList<E> list,E ... e){
        for (E es : e) {
            list.add(es);
        }
    }
}
