package A2409Sep2024.Class01;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        System.out.println();
        int[] inputArray = {1,2,3,4,5,6,7,8,9,0}; 
        int[] outputArray = new int[inputArray.length];
        System.arraycopy(inputArray, 0, outputArray, 0, inputArray.length);
   
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i]+" ");
        }
        

        System.out.println();
        int[] outputArray2 = new int[inputArray.length];
        System.arraycopy(inputArray, 6, outputArray2, 2, 3);
   
        for (int i = 0; i < outputArray2.length; i++) {
            System.out.print(outputArray2[i]+" ");
        }
        
   
    }
}
