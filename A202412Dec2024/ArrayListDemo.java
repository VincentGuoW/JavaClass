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
        //

        ar1.add("2");
        ar1.add("3");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.addAll(ar1); //add all can add it all in once
        System.out.println(ar2);

        /*
        ArrayList (new)            ==> size:   0 ; new arraylist size is zero
        ArrayList (add"a")         ==> size:  10 ; add even just one, size turns to 10
        
        if
        ArrayList (add"a"*10)      ==> size: 15 ; add elements at once and over the limit, will turn 1.5 times the size

        elseif
        ArrayList (add"a"*100)     ==> size: 101 ; add elements at once and even over 1.5 times, will just change to the requirement size


        */
    }
}
