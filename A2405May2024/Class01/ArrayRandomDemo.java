package May2024.Class01;

import java.util.Random;

public class ArrayRandomDemo {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int replacePosition = r.nextInt(arr.length);
            while (i==replacePosition) {
                replacePosition = r.nextInt(arr.length);
            }
            int temp = arr[i];
            arr[i]=arr[replacePosition];
            arr[replacePosition]=temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        
    }
}
