package May2024.Class04;

public class test4 {
    // one array save into another array
    public static void main(String[] args) {
        int[] sampleArray = new int[]{1,2,3,4,5,6};
        int[] copiedArray = arrayCopty(sampleArray);
        System.out.println(sampleArray);
        for (int i = 0; i < sampleArray.length; i++) {
            System.out.print(sampleArray[i] + " ");
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println(copiedArray);
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }

    public static int[] arrayCopty(int[]input){
        int[]output=new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i]=input[i];
        }
        return output;
    }
}
