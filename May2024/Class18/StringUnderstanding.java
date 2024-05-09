package May2024.Class18;

public class StringUnderstanding {
    /*String ==> char[] array

    char[] array = {x,x,x};
    String xxx = new String( array ); //array is a location right now(E.g. 0x0011)

    Think of string is an array of multipal chars joined together.
    So they will have commons just like an array.
    */

    

    public static void main(String[] args) {
        String s1 = "abc"; //create new array{'a','b','c'} at   => 0x0011
        String s2 = "abc"; //found the same array location, use => 0x0011
        s2="1234";         //    s1="abc"   => (0x0011)
                           //    s2="1234"  => (0x0012) cus "1234" => new char[] with different location
                  
        char[] chs = {'a','b','c'};//               ==> (E.g.) 0x0022
        String s3 = new String(chs);//              ==> (E.g.) 0x0033
        String s4 = new String(chs);//              ==> (E.g.) 0x0044
        //It will have the same result but different location
        //In fulture work, try to save space just give string not create new.
        //Save string will share location.
        //Create new will have different location everytime!!
        System.out.println();
        System.out.println("S1 : => " + s1);
        System.out.println("S3 : => " + s3);
        System.out.println("S1 same with S3 ==>" + (s1==s3));
        //using "==" means they are compairing address:  0x0011 & 0x0033
        // they are at different address.
        System.out.println("S1 same with S3 ==>" + (s1.equals(s3)));
        System.out.println("S1 same with S3 ==>" + (s1.equalsIgnoreCase(s3)));//A and a diff (cap letter diff)
        //using ".equal()" means they are compairing value;
        // "abc" equals to  "abc", so they are the same

        String test1="abc";
        String test2="abc";
        System.out.println("demo1: "+(test1==test2));

        String test3=new String("xyz");//create new object
        String test4="xyz";//reuse string object from StringPool
        System.out.println("demo2: "+(test3==test4));
      
    }
}
