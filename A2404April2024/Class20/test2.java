package April2024.Class20;

public class test2 {
    public static void main(String[] args) {
        int inputNumber = 23;
        int leftover=0;
        //num *num +digit = inputNumber;

        for (int i = 1;  leftover < i; i++) {
            
            leftover= inputNumber-i*i;
            if (leftover>=(i*i)){
                leftover=0;
                continue;
            }
            else{
                System.out.println("square:" +i+". left:"+leftover);
            }

        }
    }
}
