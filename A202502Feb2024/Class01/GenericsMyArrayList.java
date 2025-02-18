package A202502Feb2024.Class01;

import java.util.Arrays;
/*
 * To create my own Arraylist ==> Generics
 * <E> for element that unsure, when use we can
 * put different type of element init.
 * 
 */
public class GenericsMyArrayList<E> {
    Object[] obj = new Object[10];
    int size;
    //test

    public boolean add(E e){ //E type's e (E e)//(E sampleName)
        obj[size] = e;
        size++;
        return true;
    }

    //When we are unsure what element they will use 
    //The previous use E, get method also return E;
    // input type == output type
    public E get(int index){
        /*
         * Generics all saved as object
         * But they have gate <E> to lock what type they want to use.
         * When they want to use get method
         * MUST FORCE object into <E> type (input type at the gate)
         */
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
    
}
