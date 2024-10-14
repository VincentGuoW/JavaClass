package A2410Oct2024.Class03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysAPIDemo {
    public static void main(String[] args) {
        System.out.println();
        int[] arr= {1,2,3,4,5,6,7,8,9,10};

        System.out.println("-----------------------------");
        //array to string
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------");
        //BinarySearch
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 20));
        System.out.println("-----------------------------");
        

        
    }
}
