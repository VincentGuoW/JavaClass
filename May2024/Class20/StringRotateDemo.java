package May2024.Class20;

import java.util.Scanner;

public class StringRotateDemo {
    // A = "abcde"  => first rotate => "bcdea"
    // B = "xxxx"  if A==B during any rotate, then ture, else false.
    public static void main(String[] args) {
        System.out.println("First String:");
        Scanner scFirst = new Scanner(System.in);
        String firstInput =scFirst.nextLine();

        System.out.println("Second String:");
        Scanner scSecond = new Scanner(System.in);
        String secondInput =scSecond.nextLine();

        System.out.println(checkRotate(firstInput, secondInput));

    }

    public static boolean checkRotate(String input1, String input2){

        for (int i = 0; i < input1.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(input1.substring(1, input1.length()));
            sb.append(input1.charAt(0));
            input1=sb.toString();
            System.out.println("SB==>  " + sb.toString());
            // if(sb.toString().equals(input2)){
            //     return true;
            // }
            // input1=sb.toString();
            // System.out.println("input1==>  " + input1);
        }
        
        
        return false;
    }

}
