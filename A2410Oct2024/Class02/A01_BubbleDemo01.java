package A2410Oct2024.Class02;

public class A01_BubbleDemo01 {
    public static void main(String[] args) {
        //Use bubble method to organize the array

        int[]arr = {5,2,3,4,5,7,1,5};

        int times = arr.length-1;
        while(times!=0){
            for (int i = 1; i < arr.length; i++) {
                if(arr[i-1]>=arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp; 
                }
            }
            times--;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        
    }
}
