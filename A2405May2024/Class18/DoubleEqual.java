package May2024.Class18;

public class DoubleEqual {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a==b); 
        //10==10
        //true, compair with value inside.

        String c = new String("10");
        String d = new String("10");
        System.out.println(c==d); 
        //0x0011 == 0x0022
        //false, compair with value address.
    }
}
