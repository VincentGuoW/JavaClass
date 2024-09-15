package A2409Sep2024.Class04;

import java.math.BigDecimal;

public class BigDecimalDemo {
    //In short below double range use static method.(BigDecimal x =BigDecimal.valueof())
    //More than double range use instance method(BigDecimal x = new BigDecimal)
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
         BigDecimal bd2 = new BigDecimal(1.9);
         BigDecimal bd3 = new BigDecimal(1.5);
         System.out.println(bd1);// bd1=1 works
         System.out.println(bd2);// bd2=1.0 => 0.1=0.5+0.25 + 0.125, it will get pretty close to 1.9
         System.out.println(bd3);// bd3=1.5 works cus 1*(2^(-1))=0.5
         BigDecimal bd4 = bd1.add(bd2);
         System.out.println(bd4);

        //With string input, it will get acuart result!!!
         BigDecimal bds1 = new BigDecimal("1");
         BigDecimal bds2 = new BigDecimal("1.9");
         BigDecimal bds3 = new BigDecimal("1.5");
         System.out.println(bds1);
         System.out.println(bds2);
         System.out.println(bds3);
         BigDecimal bds4 = bds1.add(bds2);
         System.out.println(bds4);

         //BigDecimal.valueOf & new BigDecimal (When to use it)
         BigDecimal bd01 = BigDecimal.valueOf(1.7976931348623157E308);
         System.out.println(bd01);
         BigDecimal bd02 = new BigDecimal("999999999999999999999999999999");
         System.out.println(bd02);

         //Not the same address situation:
         BigDecimal b1 = BigDecimal.valueOf(10);
         BigDecimal b2 = BigDecimal.valueOf(10);
         System.out.println(b1==b2);//(input 0-10)true BigDecimal.valueOf(long val) different rules same address

         BigDecimal b5 = BigDecimal.valueOf(10.0);
         BigDecimal b6 = BigDecimal.valueOf(10.0);
         System.out.println(b5==b6);//false return new BigDecimal(Double.toString(val)); always new with different address

         System.out.println(b1==b6);//false



         BigDecimal b3 = new BigDecimal(10);
         System.out.println(b1==b3);//false
         BigDecimal b4 = new BigDecimal("10");
         System.out.println(b1==b4);//false
         System.out.println(b3==b4);//false
         



         


    }
}
