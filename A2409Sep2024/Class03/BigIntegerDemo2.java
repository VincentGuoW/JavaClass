package A2409Sep2024.Class03;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        System.out.println();
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("3"); 
        System.out.println(bi1);
        System.out.println(bi2);
        
        //add method
        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);

        //subtract method
        BigInteger bi4 = bi1.subtract(bi2);
        System.out.println(bi4);

        //multiply 
        BigInteger bi5 = bi1.multiply(bi2);
        System.out.println(bi5);
        
        //divide
        BigInteger bi6 = bi1.divide(bi2);
        System.out.println(bi6);

        //divide but get quotient and remainder in array 
        // E.g. [quotient,remainder]
        BigInteger[] bi7 = bi1.divideAndRemainder(bi2);
        System.out.print(bi7[0] + " "); 
        System.out.print(bi7[1]); System.out.println();

        //equals
        System.out.println(bi1.equals(bi2));

        //power ^
        System.out.println(bi1.pow(2));

        //max min
        BigInteger bi8 = bi1.max(bi2);
        System.out.println(bi1.max(bi2));
        System.out.println(bi1.min(bi2));
        System.out.println(bi2==bi8);

        //change BigInteger to int
        System.out.println(bi1.intValue());





    }
}
