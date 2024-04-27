package April2024.Class16;

public class ternaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //(a!=b)   ? a:b; Must use it, just write it done is wrong.
        String result = (a!=b)   ? ("This is true"):("I dont know"); //Just like excel
        //variable = Expression  ?  Expression2(if Trure)  :  Expression3(if False)
        System.out.printf("The max number is: " + result);
    }
}
