package PjPuzzleGame.src.com.vincent.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test============");
        Random r = new Random();
        int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        for (int i = 0; i < num.length; i++) {
            int temp = num[i];
            int random = r.nextInt(num.length);
            num[i]=num[random];
            num[random]=temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

            //method 1
        int [] [] arr = new int[4][4];
        int start = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j]=num[start];
                start++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

            //method 2
        for (int i = 0; i < num.length; i++) {
            arr[i/4][i%4]=num[i];
        }

    }
}
