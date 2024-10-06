package A2409Sep2024.Class11;

public class BinaryOctalHexString {
    public static void main(String[] args) {
        System.out.println();
        String str1 = Integer.toBinaryString(100); // 2  +
        String str2 = Integer.toOctalString(100);  // 8  +
        String str3 = Integer.toHexString(100);    // 16 +
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        /*Object.toString();
             public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
        */

        int i1 = Integer.parseInt("123");
        System.out.println(i1+1);

        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);

        /*
            byte    ==>  Byte
            short   ==>  Short
            char    ==>  Character
            int     ==>  Integer
            long    ==>  Long
            float   ==>  Float
            double  ==>  Double
            boolean ==>  Boolean

            ALL 8 wrapper class above expect character can use parseXXX to change 
            xxxx.parserXXXX("String")= xxxx type
            */

    }
}
