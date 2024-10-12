package A2410Oct2024.Class02;

public class A02_InsertDemo01 {
    public static void main(String[] args) {
        System.out.println();
        /*
        First looking for the max index has orders.
        Start adding max index + 1 into the previous orders
        until it finish


        Step:
        1. Start from 0 index, find the max index that keep in order
        2. Use the max in order index + 1 
        3. reverse the bubble method from back to front
        4. send the non-order index, find left smaller than it or to zero
        5. keep going for the rest until all finish
         */

        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        int starIndex = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                starIndex=i+1;
                break;
            }
        }

        for (int i = starIndex; i < arr.length; i++) {
            int currentIndex = i;
            //Note
            
            while (currentIndex!=0 && arr[currentIndex-1]>arr[currentIndex]) {
                int temp = arr[currentIndex];
                arr[currentIndex]=arr[currentIndex-1];
                arr[currentIndex-1]=temp;
                currentIndex--;
            }
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
