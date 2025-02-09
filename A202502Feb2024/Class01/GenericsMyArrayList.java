package A202502Feb2024.Class01;

import java.util.Arrays;

public class GenericsMyArrayList<E> {
    Object[] obj = new Object[10];
    int size;
    //test

    public boolean add(E e){ //E type's e (E e)//(E sampleName)
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){return (E)obj[index];}

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
    
}
