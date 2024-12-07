package A202412Dec2024;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        /*
        add
        remove
        set
        get
         */
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        //list.add(1);

        list.add("fff");


        list.add("ppp");
        list.add(0,"ppp");

        String removed = list.remove(1);//removed aaa
        System.out.println(removed);//print aaa, but it not on list anymore
        System.out.println(list.remove("xxx"));
        System.out.println(list.remove("ccc"));
        //if i just write 1, will that be index 1 or element 1
        //==> auto pick the closet answer, if they have two options 
        //it will pick the one 100% match
        list.remove(1);//will be element 1

        Integer i = Integer.valueOf(1);
        list.remove(i);//will be number 1
        //int ==> primitive type
        //Integer ==> reference type


        int textIndex = 3;
        String setAfter = list.set(textIndex, "xxx");
        System.out.println(setAfter);

        String getAfter = list.get(4);
        System.out.println(getAfter);

        System.out.println(list);
        
    }
}
