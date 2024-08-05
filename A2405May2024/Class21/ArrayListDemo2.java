package May2024.Class21;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //create arraylist and then list all of it
        String string1="abc";
        String string2="123";
        String string3="ABC";

        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add(string1);
        arraylist.add(string2);
        arraylist.add(string3);
        System.out.println(arraylist);

        System.out.print("[");
        for (int i = 0; i < arraylist.size(); i++) {
            if(i==arraylist.size()-1){
                 System.out.print(arraylist.get(i));
            }
            else{
                System.out.print(arraylist.get(i)+",");
                
            }

        }
        System.out.print("]");
        System.out.println();

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

    }
}
