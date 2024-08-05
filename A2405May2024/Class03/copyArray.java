package May2024.Class03;

public class copyArray {
    public static void main(String[] args) {
       int[]inputArray = new int[]{1,2,3,4,5,6,7,8,9,10};
       int fromNumber = 3;
       int toNumber = 6;
       
       int[] result = copyArrayVincent(inputArray, fromNumber, toNumber);
       for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
       }
    }

    public static int[] copyArrayVincent(int[] inputArray, int from, int to){
        int[]outputArray=new int[to-from];
        for (int i = from; i < to; i++) {
            outputArray[i-from]=inputArray[i];
        }
        return outputArray;
    }
}
