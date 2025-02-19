package A202502Feb2024.Class02;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo2 {
    public static void main(String[] args) {
        //Generics is like a door keeper from the beginning
        //Define the correct data type for input
        ArrayList<Integer> listDemo2 = new ArrayList<>();
        //listDemo2.add("abc");
        listDemo2.add(123);
        //listDemo2.add(true);
        //listDemo2.add(new Student("ttt", 321));


        Iterator<Integer> it = listDemo2.iterator();
        while (it.hasNext()) {
            Integer elem =  it.next();
            System.out.println(elem);
        }
    }
}
