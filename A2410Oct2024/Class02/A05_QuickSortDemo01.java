package A2410Oct2024.Class02;

public class A05_QuickSortDemo01 {
    public static void main(String[] args) {
        System.out.println();
        /*
         * Ideal: split number between first index left small right big
         */
        int[] arr = {6,1,2,7,9,3,4,5,10,8};

        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }


    }

    public static void quickSort(int[] arr, int startIndex, int endIndex){
        int startIdx = startIndex;
        int endIdx = endIndex;

        int baseNumber = arr[startIdx];
        //from start to end check value greater than baseNumber
        //PS:We want everything less than base Number on the left side
        while(startIdx != endIdx){
            //!!!!!!!!!Important!!!!!!!!!
            //Because baseNumber at left
            //Must use small number to replace baseNumber
            //So 2 while must do right side (end<base) first!!!!!
            while (true) {
                if(arr[endIdx]<baseNumber||endIdx<=startIdx){
                    break;
                }
                endIdx--;                
            }
            while (true) {
                if(arr[startIdx]>baseNumber||endIdx<=startIdx){
                    break;
                }
                startIdx++;
            }
            
            System.out.println("Start"+startIdx);
            System.out.println("End"+endIdx);
            int temp = arr[startIdx];
            arr[startIdx]=arr[endIdx];
            arr[endIdx]=temp;
        }
        //swith the first one with middle one
        
        int temp = arr[startIndex];
        arr[startIndex]=arr[startIdx];
        arr[startIdx]=temp;

    }
}
