package May2024.Class01;

import java.util.Random;

public class ArrayRandomSave {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int arrayNumber = r.nextInt(5);
            while (arr[arrayNumber]!=0) {
                arrayNumber = r.nextInt(5);
            }
            arr[arrayNumber]=i+1;
            System.out.println(arrayNumber);
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
    }
}
