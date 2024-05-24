package May2024.Class19;

import May2024.Class18.test;

public class StringDemo6 {
    public static void main(String[] args) {
        String testNumber = "123456";
        String testNumber2 = testNumber;
        String testNumber3 = "123456";
        String testNumber4 = "1";
        System.out.println("Result:");
        System.out.println(testNumber==testNumber2);//true
        System.out.println(testNumber2==testNumber3);//true
        String testNumber5 = testMethodOne(testNumber);
        System.out.println(testNumber4==testNumber5);//false
        String testNumber6 = testMethodTwo(testNumber);
        System.out.println(testNumber3==testNumber6);
    }

    public static String testMethodOne(String inputString){
        String output="";
        output=output + inputString.charAt(0);//This is the reason of false
        System.out.println("The testNumber 4 should be: "+output);
        return  output;
    }
    public static String testMethodTwo(String inputString){
        String output="";
        output=inputString;
        System.out.println("The testNumber 4 should be: "+output);
        return  output;
    }
}
