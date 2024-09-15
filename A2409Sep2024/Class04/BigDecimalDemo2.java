package A2409Sep2024.Class04;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(11.0);
        BigDecimal b2 = new BigDecimal(12.0);
        BigDecimal b3 = new BigDecimal(11.0);
        System.out.println(b1.add(b2));
        System.out.println(b3.add(b2));

        BigDecimal b11 = BigDecimal.valueOf(11.1);//==11.1 cus it saved as String for valueOf
        BigDecimal b31 = new BigDecimal(11.1);//==11.0999999999999996447286321199499070644378662109375
        BigDecimal b21 = new BigDecimal(12.1);//==12.0999999999999996447286321199499070644378662109375
        System.out.println(b11.add(b21));
            //23.1999999999999996447286321199499070644378662109375
        System.out.println(b31.add(b21));
            //23.1999999999999992894572642398998141288757324218750


        //The key for it is ==>BigDecimal.valueOf ==> return new BigDecimal(Double.toString(val));
        /*
        b11     .valueOf            ==>     11.1 cos it straight goes to .toSting()
            == 11.1
        b32     new BigDecimal()    ==>     saved as 11.0999999999999996447286321199499070644378662109375
            == 11.0999999999999996447286321199499070644378662109375
        b21
            == 12.0999999999999996447286321199499070644378662109375

        Therefor when we calculated b11 + b32 = 11.1 + 11.0999999999999996447286321199499070644378662109375
                                    
                                    b21 + b32 =11.0999999999999996447286321199499070644378662109375 
                                                    + 11.0999999999999996447286321199499070644378662109375    

                                    We will get different answer
        
        */


    }
}
