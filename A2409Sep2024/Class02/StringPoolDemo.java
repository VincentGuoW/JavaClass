package A2409Sep2024.Class02;

public class StringPoolDemo {
    
    public static void main(String[] args) {
        System.out.println();
        Integer  num1 = 127;
        Integer  num2 = 127;
        Integer  num3 = 128;
        Integer  num4 = 128;

        System.out.println(num1 + " , " +num2 + " , " +num3 + " , " +num1 );
        System.out.println(num1==num2);
        System.out.println(num3==num4);

        String s1 = "Sample";
        String s2 = "Sample";
        String s3 = new String("Sample");
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        s2="New sample";
        System.out.println(s1);
    }
}
