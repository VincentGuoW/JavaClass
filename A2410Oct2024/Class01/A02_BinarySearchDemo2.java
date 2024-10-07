package A2410Oct2024.Class01;

public class A02_BinarySearchDemo2 {
    public static void main(String[] args) {
        //Binary search ==> the array must in order!
        //  1.cut in half if greater than middle number, pick right. Less pick left
        //  the mid doesn't pick in the middle, since the array is in order
        //  so they try to find the percentage first
    
    }

    public static int binarySearch(int[] arr, int number){
        int min = 0;
        int max = arr.length-1;
        while (true) {
            //Dont just cut in half from middle
            //int mid = (max+min)/2;
            /*
             For example:  {10000 , 10004 , .... 20004 , 20008}
                and the number that we are looking for is ==> 10004
                    if use mid = (max+min)/2
                    mid = 15004 which is way far away from 10004
                    So we kind want to know the percentage of the spot where
                    it should locat at
                    int mid = min + ((number-arr[min])/(arr[max]-arr[min]))*(max-min);
                    min==> where it start from
                    (number-arr[min]) ==> how far away from the min
                    /(arr[max]-arr[min])) ==> with that distance, what's the percentage of the total
                    *(max-min) times the total index
                    will get the index based on the percentage of total index
                    
             */
            int mid = min + ((number-arr[min])/(arr[max]-arr[min]))*(max-min);

            if(min>max){
                return -1;
            } 
            if(number <arr[mid]){
                max=mid-1;    
            }else if(number > arr[mid]){
                min=mid+1;
            }else{
                return mid;
            }
        }


    }
}
