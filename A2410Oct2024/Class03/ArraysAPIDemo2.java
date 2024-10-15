package A2410Oct2024.Class03;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysAPIDemo2 {
    public static <T> void main(String[] args) {
        //Arrays sort base rull will be small to large
        //If I want Large to Small need to do following
        int[] arr1 = { 10, 2, 3, 5, 6, 1, 7, 8, 4, 9 };
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //Can't use int anymore, Must be Integer!!!
        Integer[] arr2 = { 10, 2, 3, 5, 6, 1, 7, 8, 4, 9 };
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
            
        });
        System.out.println(Arrays.toString(arr2));


    }
}
