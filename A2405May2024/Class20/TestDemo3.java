package May2024.Class20;

public class TestDemo3 {
    public static void main(String[] args) {
        //Two string number(non negitive int), multiply together
        System.out.println();
        String num1 ="123";
        String num2 ="321";

        int result = stringToInt(num1)*stringToInt(num2);
        System.out.println(result); 

    }

    public static int stringToInt(String input){
        char[] numArry = input.toCharArray();
        int numInt=0;
        for (int i = 0; i < numArry.length; i++) {

            numInt= numInt*10+(int)(numArry[i]-'0');

        }
        System.out.println(numInt);
        return numInt;
    }
}
