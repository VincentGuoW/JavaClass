package A2410Oct2024.Class02;

import java.util.Random;


public class CombineTest {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = new int[100];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(0,10000);
        }
        System.out.println("The total time cost for quickSort Method: "+quickSortMethod(arr));
        System.out.println("The total time cost for insert Method: "+insertMehod(arr));
        System.out.println("The total time cost for select Method: "+selectMethod(arr));
        System.out.println("The total time cost for bubble Method: "+bubbleMethod(arr));
        

        System.out.println("DONE");
    }

    public static long selectMethod(int[]arr){
        long start = System.nanoTime();
        int[] arrSelect = arr.clone();

        for (int i = 0; i < arrSelect.length-1; i++) {
            for (int j = i+1; j < arrSelect.length; j++) {
                if(arrSelect[i]>arrSelect[j]){
                    int temp = arrSelect[i];
                    arrSelect[i]=arrSelect[j];
                    arrSelect[j]=temp;
                }
            }
        }
        long end = System.nanoTime();
        System.out.println("List start");
        for (int i = 0; i < arrSelect.length; i++) {
            System.out.print(arrSelect[i]+",");
        }
        System.out.println("List end");

        return end-start;
    }

    public static long bubbleMethod(int[] arr){
        long start = System.nanoTime();
        int[] arrBubble = arr.clone();
        int arrLength = arrBubble.length;
        while (arrLength!=0) {
            for (int i = 0; i < arrBubble.length-1; i++) {
                if(arrBubble[i]>arrBubble[i+1]){
                    int temp = arrBubble[i];
                    arrBubble[i]=arrBubble[i+1];
                    arrBubble[i+1]= temp;
                }
                arrLength--;
            }
        }

        long end = System.nanoTime();
        System.out.println("List start");
        for (int i = 0; i < arrBubble.length; i++) {
            System.out.print(arrBubble[i]+",");
        }
        System.out.println("List end");

        return end-start;
    }

    public static long quickSortMethod(int[]arr){
        long start = System.nanoTime();
        int [] arrQuickSort = arr.clone();
        quickSort(arrQuickSort,0,arrQuickSort.length-1);
        long end = System.nanoTime();
        System.out.println("List start");
        for (int i = 0; i < arrQuickSort.length; i++) {
            System.out.print(arrQuickSort[i]+",");
        }
        System.out.println("List end");
        return end-start;

    };

    public static void quickSort(int[]arr,int startIndex, int endIndex){

        int startIdx = startIndex;
        int endIdx = endIndex;
        if(startIdx>endIdx){

            return;
        }
        int baseNumber = arr[startIdx];
        while(startIdx!=endIdx){
            while (true) {
                if(arr[endIdx]<baseNumber || endIdx<=startIdx){
                    break;
                }
                endIdx--;
            }
            while (true) {
                if(arr[startIdx]>baseNumber || endIdx<=startIdx){
                    break;
                }
                startIdx++;
            }
            int temp = arr[startIdx];
            arr[startIdx]=arr[endIdx];
            arr[endIdx]=temp;
        }
        int temp = arr[startIndex];
        arr[startIndex]=arr[startIdx];
        arr[startIdx]=temp;
        //left side
        quickSort(arr, startIndex, startIdx-1);
        //right side
        quickSort(arr, startIdx+1, endIndex);

        return; 

    }

    public static long insertMehod(int[]arr){
        long start = System.nanoTime();
        int[] arrInsert = arr.clone();
        int startIndex = 0;
        for (int i = 0; i < arrInsert.length-1; i++) {
            if(arrInsert[i]<arrInsert[i+1]){
                startIndex=i+1;
                break;
            }
        }
        for (int i = startIndex; i < arrInsert.length; i++) {
            int currentIndex = i;
            while(currentIndex!=0 && arrInsert[currentIndex]<arrInsert[currentIndex-1]){
                int temp = arrInsert[currentIndex];
                arrInsert[currentIndex]=arrInsert[currentIndex-1];
                arrInsert[currentIndex-1]=temp;
                currentIndex--;
            }
    
        }
        long end = System.nanoTime();
        System.out.println("List start");
        for (int i = 0; i < arrInsert.length; i++) {
            System.out.print(arrInsert[i]+",");
        }
        System.out.println("List end");

        return end-start;

    }

    
}
