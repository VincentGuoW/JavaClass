package May2024.Class03;

public class reloadDemo {
    /*How the reload work
        1. Under the same class (E.g. reloadDemo class)
        2. input different (int num1) (double num1) (int num1,int num2)
        3. Not common but switch input will make reload work 
                    (int num1, double num2)=>(double num1, int num2)
    */
    public static void main(String[] args) {
        
    }
    public static int sum(int num1){
        return num1;
    }
    public static int sum(long num1){
        return (int)num1;
    }
    public static long sum(double num1){
        return (long)num1;
    }
    public static boolean sum(int num1, int num2){
        boolean resulte = num1 >num2;
        return resulte;
    }
    public static int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    /* 
    This is wrong cus input value are the same.
    public static boolean sum(int num1, int num2, int num3){
        return num1>num2;
    }
    */
}
