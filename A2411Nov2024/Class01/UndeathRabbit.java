package A2411Nov2024.Class01;

public class UndeathRabbit {
    public static void main(String[] args) {
        /*
        One pair of rabbit, After three month, give birth a pair each month.

        Month
            1  ==>  1    1
            2  ==>  1   (1)
            3  ==>  2   (1                        +    1)
            4  ==>  3   (1+1)                     +   (1)
            5  ==>  5   (1+1)          +  (1)     +   (1+1)
            6  ==>  8   (1+1)  +(1)    +  (1+1)   +   (1+1) + 1
            ....    

        */

        int [] arr = new int[12];
        arr[0]=1;
        arr[1]=1;

        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("RESULT: ");
        System.out.println(arr[11]);


        
    }
}
