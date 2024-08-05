package May2024.Class21;

import java.util.ArrayList;

public class ArrayListDemo1 {
    /*
    boolean => add(E e)                 //Add

    boolean => remove(E e)              //Delete
    E       => remove(int index)        //Delete

    E       => set(int index, E e)      //Change

    E       => get(int index)           //Search

    int     => size()                   //get length

     */
    public static void main(String[] args) {
        System.out.println();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("aaa");
        arrayList.add("ccc");
        arrayList.add("ddd");
        arrayList.add("eee");
        arrayList.add("fff");
        System.out.println("ADD===> "+ arrayList.add("gggg"));
        System.out.println(arrayList);
        

        System.out.println("REMOVE STRING===> "+ arrayList.remove("aaa"));
        System.out.println(arrayList);

        System.out.println("REMOVE INDEX===> "+ arrayList.remove(3));
        System.out.println(arrayList);


        System.out.println("SET===> "+ arrayList.set(0, "NEW STUFF"));
        System.out.println(arrayList);//set reture the previous one the one been recovered.

        System.out.println("GET===> "+ arrayList.get(0));
        System.out.println(arrayList);

        System.out.println("SIZE===> "+ arrayList.size());
        System.out.println(arrayList);




    }
}
