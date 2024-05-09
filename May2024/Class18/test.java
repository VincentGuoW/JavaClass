package May2024.Class18;

public class test {
    public static void main(String[] args) {
        String s1 = "abc"; //create new array{'a','b','c'} at   => 0x0011
        String s2 = "abc"; //found the same array location, use => 0x0011

        char[] chs = {'a','b','c'};//               ==> (E.g.) 0x0022
        String s3 = new String(chs);//              ==> (E.g.) 0x0033
        String s4 = new String(chs);//              ==> (E.g.) 0x0044

        s2="vincent";
        System.out.println(s1);
    }
}
