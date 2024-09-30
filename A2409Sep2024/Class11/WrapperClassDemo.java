package A2409Sep2024.Class11;

public class WrapperClassDemo {
    public static void main(String[] args) {
        System.out.println();
        /*
            Primitive Data Type:
                int         i   =   10;
            Wrapper Class:     
                Integer     x   =   new Integer(10);
            They are all int 10, but int is primitive data type;
            Integer is wrapper class with value int 10 inside;
            but Integer x is recording the location, not value anymore.
         */

         /*
            byte    ==>  Byte
            short   ==>  Short
            char    ==>  Character
            int     ==>  Integer
            long    ==>  Long
            float   ==>  Float
            double  ==>  Double
            boolean ==>  Boolean

          */

        int i =10;
        @SuppressWarnings("removal")
        Integer in1 = new Integer(10);
        System.out.println(i);
        System.out.println(in1);

        Integer in2 = Integer.valueOf(10);
        Integer in3 = Integer.valueOf("10");
        Integer in4 = Integer.valueOf("111",2); //Radix 2 "111" == 7
        System.out.println(in2);
        System.out.println(in3);
        System.out.println(in4);


    }
}
