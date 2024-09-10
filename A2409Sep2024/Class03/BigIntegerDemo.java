package A2409Sep2024.Class03;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    //BigInteger(int num,Random r) get random number between 0 to 2^num-1
            //(Included 0 and 2^num-1)
    //BigInteger(String val) 
            //Integer in String mode can be save into BigInteger
    //BigInteger(String val, int radix)
            //Integer in String mode, set with the input radix/base


    public static void main(String[] args) {
        //BigInteger(int num,Random r)
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            BigInteger bi1= new BigInteger(4,r); //[0,2^4-1] or [0,2^4)
            BigInteger bi2= new BigInteger(4, new Random());//[0,2^4-1] or [0,2^4)
            System.out.println(bi1);
            
            System.out.println(bi2);
            
        }
        //It must be string, and it also must be Integer
        //Otherwise it will cause fault
        BigInteger bi3=new BigInteger("1000");
        System.out.println(bi3);



        //Input String must be Integer, and must fit for radix/base style.
        //BigInteger wrong=new BigInteger("1257",2); is wrong
        //There can't be 2/5/6 insize 2 radix.
        BigInteger bi4=new BigInteger("1000",10);//==1000
        System.out.println(bi4);

        BigInteger bi5=new BigInteger("1000",3);//1*(3^3)+0*(3^2)+0*(3^1)+0*(3^0)
        System.out.println(bi5);

        BigInteger bi6=new BigInteger("1000",2);//1*(2^3)+0*(2^2)+0*(2^1)+0*(2^0)
        System.out.println(bi6);

        //Use the BigInteger build in method valueOf to change Long value into BigInteger
        BigInteger bi7 = BigInteger.valueOf(10000);
        System.out.println(bi7);



        //Quick Tip:
                //BigInterger range -16 to 16 will share address.
                //Go definition valueOf for detail design
        BigInteger b1 = BigInteger.valueOf(16);
        BigInteger b2 = BigInteger.valueOf(16);
        BigInteger b3 = BigInteger.valueOf(17);
        BigInteger b4 = BigInteger.valueOf(17);
        System.out.println(b1==b2);//true (same address)
        System.out.println(b3==b4);//false (different address)


        //BigInteger can't change value once been creative
        BigInteger bdone1 = new BigInteger("1");
        BigInteger bdone2 = new BigInteger("3");
        bdone1=new BigInteger("2");
        System.out.println(bdone1);//2
        System.out.println(bdone1.add(bdone2));//5
        System.out.println(bdone1);//2
        //We can create new BigInteger to replace the old one.

        //Calulation with BigInteger will only create new BigInteger
                //It wont influce the previous ones
        //But bdone1.add(bdone2) ==> will create new BigInteger
        //It won't influce bdone1 or bdone2
        // (bdone1=bdone1+bdone2) != (bdone1.add(bdone2))


    }
}
