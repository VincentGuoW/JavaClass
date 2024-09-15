package A2409Sep2024.Class04;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
        //ADD
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //Multiply
        BigDecimal bd4 = bd1.multiply(bd2);
        System.out.println(bd4);

        //Subtract
        BigDecimal bd5 = bd1.subtract(bd2);
        System.out.println(bd5);

        //Divide
        //BigDecimal bd6 = bd1.divide(bd2); Wrong, 
            //The divide method only works for divisions with no remainder.
        BigDecimal bd6 = bd1.divide(bd2,2,RoundingMode.HALF_UP);
        System.out.println(bd6);


        
    }
    


}
