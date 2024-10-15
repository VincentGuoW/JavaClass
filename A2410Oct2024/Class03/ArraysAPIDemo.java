package A2410Oct2024.Class03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysAPIDemo {
    public static void main(String[] args) {
        System.out.println();
        int[] arr= {1,2,3,4,5,6,7,8,9,10};

        System.out.println("--------------To String---------------");
        //array to string
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------BinarySearch---------------");
        //BinarySearch
        //If exist, return index; If not, return should input location times -1 then -1;
        //Purpose: if number small enough, should be at the first location, then return zero
        //but -1 * 0 = 0; when computer see 0, they will think it's at the 0 index.
        //So we have to -1 after calcualtion to prevent it.
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 20));
        System.out.println("------------copyOf-----------------");
        //copyOf
        //Parameter 1: arr (Original array )
        //Parameter 2: number (lenght of new array) 
        //if less, get less, is more add default initialization value
        //int,long,double ==default initialization value ==> 0
        //char  == default initialization value ==> u000;
        //boolean == default initialization value ==> false;
        int[] arrCopyOf1 = Arrays.copyOf(arr, 3);   //[1, 2, 3]
        int[] arrCopyOf2 = Arrays.copyOf(arr, 10);  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        int[] arrCopyOf3 = Arrays.copyOf(arr, 13);  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10,0,0,0]
        System.out.println(Arrays.toString(arrCopyOf1));
        System.out.println("--------------CopyOfRange---------------");
        //CopyOfRange
        //copyOfRange(arrayOrigin,fromX,toY)==> [X,Y), include x not include y
        int [] arrCopyOf4 = Arrays.copyOfRange(arr, 1, 2);//[2]
        System.out.println(Arrays.toString(arrCopyOf4));
        System.out.println("------------Fill-----------------");
        //fill
        //Fill array with all the same value ==>
        Arrays.fill(arr, 110);//[110,110,110,......110]
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------Sort---------------");
        //Sort
        int[] arr2 = {10,2,3,5,6,1,7,8,4,9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        
    }
}
