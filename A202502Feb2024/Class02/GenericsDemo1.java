package A202502Feb2024.Class02;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //If no Generics, we can add anything below to object
        ArrayList listdemo1 = new ArrayList();
        listdemo1.add("String"); //String
        listdemo1.add(123);      //Int
        listdemo1.add(true);     //Boolean
        
        //Instance of the "Student" class
        listdemo1.add(new Student("name",123)); 

        Iterator it= listdemo1.iterator();
        while (it.hasNext()) {
            Object elem =  it.next();
            System.out.println(elem);
        }
        //Down part is if we don't set up generics, it will auto pick Oject 
    }
}
