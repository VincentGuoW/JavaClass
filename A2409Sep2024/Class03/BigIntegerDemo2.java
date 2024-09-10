package A2409Sep2024.Class03;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        System.out.println();
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("3"); 
        BigInteger[] result = bi1.divideAndRemainder(bi2);
        System.out.print("[ ");  
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+  " ");
        }
        System.out.print("]");  

    }
}
