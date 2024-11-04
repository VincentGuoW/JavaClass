package A2411Nov2024.Class01;

public class UndeathRabbit2 {
    public static void main(String[] args) {
        /*
         * One pair of rabbit, After three month, give birth a pair each month.
         * 
         * Month
         * 1 ==> 1 1
         * 2 ==> 1 (1)
         * 3 ==> 2 (1 + 1)
         * 4 ==> 3 (1+1) + (1)
         * 5 ==> 5 (1+1) + (1) + (1+1)
         * 6 ==> 8 (1+1) +(1) + (1+1) + (1+1) + 1
         * ....
         * 
         */
        System.out.println();
        System.out.println(fibonacciMethod(12));

    }

    public static int fibonacciMethod(int month) {
        if(month==1 || month==2){
            return 1;
        }
        else{
            return fibonacciMethod(month-1)+fibonacciMethod(month-2);
        }

    }
}
