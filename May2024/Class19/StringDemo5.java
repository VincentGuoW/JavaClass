package May2024.Class19;

import java.util.Scanner;

import April2024.Class18.forLoop;

public class StringDemo5 {
    // 12345 => one,two,three,four,five
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number");
        int inputNumber = sc.nextInt();
        String output = "";
        int inputDigit = 0;
        int numberForTest= inputNumber;
        while (numberForTest>0) {
            if(numberForTest%10>0){
                inputDigit++;
                numberForTest=numberForTest/10;
            }
            else{
                break;
            }
        }

        numberForTest= inputNumber;
        int[]numberForTestArray=new int[inputDigit];
        for (int i = inputDigit-1; numberForTest>0; i--) {
           numberForTestArray[i]=numberForTest%10;
           numberForTest=numberForTest/10;
        }

        for (int i = 0; i < numberForTestArray.length; i++) {
            int temp = numberForTestArray[i];

            output=output+intToString(temp)+", ";
        }
        System.out.println(output);
    }

    public static String intToString(int inputNumber) {
        String result = "";
        switch (inputNumber) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;

            default:
                break;
        }

        return result;
    }
}
