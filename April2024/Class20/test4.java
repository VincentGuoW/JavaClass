package April2024.Class20;


public class test4 {
    public static void main(String[] args) {
        int number = 2333;
        boolean flag=true;
        for (int i = 1; i < number; i++) {
            if (number%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Trure");
        }
        else{
            System.out.println("False");
        }
    }
    
}
