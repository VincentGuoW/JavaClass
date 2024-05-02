package May2024.Class03;

public class test1 {
    public static void main(String[] args) {
        //test 1 => list array
        int [] input1 = new int[]{11,22,33,44,55};
        sameLineArray(input1);

        //test 2 => max number
        System.out.println();
        System.out.println("-------------------------------------");
        int [] input2 = new int[]{11,22,33,44,55};
        int hightestValue =hightestValue(input2);
        System.out.println(hightestValue);

        // test 3 => check number exist
        System.out.println("-------------------------------------");
        int [] input3 = new int[]{11,22,33,44,55};
        int testNumber =22;
        boolean checkNumber = numberExist(input3, testNumber);
        System.out.println(testNumber + " inside array: " + checkNumber);
    
    }

    //test1
    public static void sameLineArray(int [] input) {
        System.out.print("[");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if(i!= input.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static int hightestValue(int[] input){
        int hightestValue=input[0];
        for (int i = 1; i < input.length; i++) {
            if(input[i]>hightestValue){
                hightestValue=input[i];
            }
        }
        
        return hightestValue;
    }

    public static boolean numberExist(int[] inputArray,int inputNumber){
        boolean result = false;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputNumber==inputArray[i]){
                result=true;
                return result;
            }
        }
        
        return result;
    }
}
