package A2409Sep2024.Class11;

public class IntegerCalculation {
    public static void main(String[] args) {
        System.out.println();
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(2);

        int int1 = i1.intValue();
        int int2 = i2.intValue();
        int intResult = int1 + int2;
        int intResult2 = i1.intValue()+i2.intValue();
        System.out.println(intResult);
        System.out.println(intResult2);

        //New java (java5 and above), it will auto change int integer
        //E.g.

        Integer i3 = 3;
        int int3 = i3;
        System.out.println(i3);
        System.out.println(int3);
    }
}
