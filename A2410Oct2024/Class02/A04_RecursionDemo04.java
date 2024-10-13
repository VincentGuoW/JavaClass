package A2410Oct2024.Class02;

public class A04_RecursionDemo04 {
    public static void main(String[] args) {
        //get factorial of 5 ==>   5! == 5*4*3*2*1
        //Now I want recursion method to get factorial of 100;

        System.out.println();
        System.out.println(getFactorial(10));


    }

    public static int getFactorial(int number){
        if(number==1){
            return number;
        }

        return number * getFactorial(number-1);
    }
}
