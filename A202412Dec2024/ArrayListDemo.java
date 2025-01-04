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
        

        ar1.add("2");
        ar1.add("3");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.addAll(ar1); //add all can add it all in once
        System.out.println(ar2);
    }
}
