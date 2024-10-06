package A2409Sep2024.Class11;

public class WrapperClassTest1 {
    public static void main(String[] args) {
        Integer i1 = new Integer("12");
        Integer i2 = new Integer(13);
        System.out.println(i1);
        System.out.println(i2);

        Integer i3 = Integer.valueOf(14);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("11",2);
        System.out.println(i4);

        Integer v1 = Integer.valueOf(127);
        Integer v2 = Integer.valueOf(127);
        Integer v3 = Integer.valueOf(128);
        Integer v4 = Integer.valueOf(128);
        Integer v5 = new Integer(127);
        Integer v6 = new Integer(127);
        Integer v7 = new Integer(128);
        Integer v8 = new Integer(128);

        //Integer.valueOf ==> read code ==> if value >= -128 && <= 127
        //Then no new, just return 
        System.out.println(v1==v2);//true
        System.out.println(v3==v4);//false
        System.out.println(v5==v6);//false
        System.out.println(v7==v8);//false

        

        

    }
}
