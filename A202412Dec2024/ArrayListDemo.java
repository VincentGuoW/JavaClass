package A202412Dec2024;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<String> ar1 = new ArrayList<>();
        System.out.println(ar1.size());// = 0

        ar1.add("1");
        System.out.println(ar1.size());// = 1
        //  ==>"1" means 2 things
        //      1.current amount
        //      2.next element input index
        
    }
}
