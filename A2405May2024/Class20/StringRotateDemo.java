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
            //sb.append(input1.substring(1, input1.length())); until last don't need the last one
            sb.append(input1.substring(1));
            sb.append(input1.charAt(0));
            input1=sb.toString();
            if(sb.toString().equals(input2)){
                return true;
            }
        }
        
        
        return false;
    }

    public static boolean methodTwo(String input,String input2){
        //change string in to array for second method.
        char[] arr = input.toCharArray();
        String str="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                str = str+ arr[j];
            }
            if(str.equals(input2)){
                return true;
            }
            else{
                str="";
                char temp = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    arr[j-1]=arr[j];
                }
                arr[arr.length-1]=temp;
            }
        }
        return false;
    }

}
