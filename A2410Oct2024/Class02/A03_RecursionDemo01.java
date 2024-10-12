package A2410Oct2024.Class02;

public class A03_RecursionDemo01 {
    public static void main(String[] args) {
        //Get sum for 1-100 with recursion method

        System.out.println(getSum(100, 1));
    }

    public static int getSum(int maxNumber,int minNumber){
        if(maxNumber==minNumber){
            return maxNumber;
        }

        return maxNumber+getSum(maxNumber-1, minNumber);
        /*
            100+getSum(99-1,1)==>
             99+getSum(98-1,1)==>
             98+getSum(97-1,1)==>
             .
             .
             .
              2+getSum(2-1,1)====>
                find out 1==1 and retrun 1, cus the last one maxNumber is 1, not 2
                then add everything together
         */
    }

}
