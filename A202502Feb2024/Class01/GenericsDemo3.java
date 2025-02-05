package A202502Feb2024.Class01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo3{
    public static void main(String[] args) {
        
        System.out.println();
        //Must be Integer, can't be int
        
        //Int       saved in ==> stack
        //Integer   saved in ==> heap
        ArrayList<Object> list = new ArrayList<>();
        //ArrayList Generics must be an Object, not fast saving Int in stack.
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
       

        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String)it.next();
            int strLength = str.length();
            System.out.println(strLength);

        }
    }
}
