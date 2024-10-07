package A2410Oct2024.Class01;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //Binary search ==> the array must in order!
        //  1.cut in half if greater than middle number, pick right. Less pick left
    
    
    }

    public static int binarySearch(int[] arr, int number){
        int min = 0;
        int max = arr.length-1;
        while (true) {
            int mid = (max+min)/2;
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
