package A2410Oct2024.Class01;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        System.out.println();
        //Basic search find if something exist and get the index
        //{131,127,147,81,103,23,7,79}
        int[]arr = {131,127,147,81,103,23,7,79,81};
        int result = basicSearch1(arr, 81);
        System.out.println(result);
        ArrayList<Integer> resultArr = basicSearch2(arr, 81);
        for (int i = 0; i < resultArr.size(); i++) {
            System.out.print(resultArr.get(i) + " ");
        }
    }

    //Basic search find if something exist and get the index
    public static int basicSearch1(int[]arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }
    //Upgrade consider is there's repeat element
    public static ArrayList<Integer> basicSearch2(int[]arr,int number){
        ArrayList<Integer> resultArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                resultArr.add(i);
            }
        }
        return resultArr;
    }
}
