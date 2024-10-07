package A2410Oct2024.Class01;

public class A02_FibonacciSequence {
    public static void main(String[] args) {
        /*
            int[] arr = {2,3,4,6,8,12,17,23,45,67,89};
            arr.length = 11;

            Find if 23 in arr.

            Fibonacci Sequence{0,1,1,2,3,5,8,13}
                    Index ==>  0,1,2,3,4,5,6, 7

         */

         int[] arr = {2,3,4,6,8,12,17,23,45,67,89};
         int arrLength = arr.length; // ==> 11
         //Where to start it? Go Fibonacci Sequence find the value above lengh
         //13>11 ==> so we pick index 7 as the k to start with.

         //Round 1!!! range 0-10
         //K=7 (Round 1)
         //F(k)   = 13;
         //F(k-1) = 8;
         //F(k-2) = 5;
         int round1Mid = arr[0+5];//==>12; and it's below 23. So the value might be on right side

         //Round 2!!! range (5+1)-10
         //K=6 (Round 2)
         //F(k)   = 8;
         //F(k-1) = 5;
         //F(k-2) = 3;
         int round2Mid = arr[6+3];//==>67; it's above 45

         //Round 3!!! range (5+1)-(9-1)
         //K=5 (Round 3)
         //F(k)   = 5;
         //F(k-1) = 3;
         //F(k-2) = 2;
         int round3Mid = arr[6+2];//==>45; it's  45


    }
}
