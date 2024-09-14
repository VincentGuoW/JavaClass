package A2409Sep2024.Class04;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(0.09+0.01);//0.09999999999999999
        System.out.println(0.216-0.1);//0.11599999999999999
        System.out.println(0.226*0.01);//0.0022600000000000003
        System.out.println(0.09/0.1);//0.8999999999999999
        //Means reason:
                //decimal take 2 much bit space for recording.
                //If there's not enought space for decimal it will just record the closet number just like above
        /*

            float   ==>  32 bit(total) => 23 bit(decimal)
            double  ==>  64 bit(total) => 52 bit(decimal)

            1*(2^(-1))=0.5
            1*(2^(-2))=0.25
            1*(2^(-3))=0.125

            e.g. 0.895 ==> 0.111    (3bits)
                 0.9   ==> 0.111001100110011001100110011001100110011001......(need 45bit)

         */

         BigDecimal bd1 = new BigDecimal(1);
         BigDecimal bd2 = new BigDecimal(1.1);
         BigDecimal bd3 = bd1.add(bd2);
         System.out.println(bd3);

    }
}
