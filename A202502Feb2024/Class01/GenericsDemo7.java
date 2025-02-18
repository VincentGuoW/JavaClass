package A202502Feb2024.Class01;

import java.util.ArrayList;

public class GenericsDemo7 {
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!");
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll1(list1, "aaa", "bbb", "ccc");
        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll2(list2, 123, 223, 321,1,1,1,1,1,123);

        System.out.println(list1);
        System.out.println(list2);

        
    }
}
