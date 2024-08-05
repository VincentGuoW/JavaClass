package May2024.Class20;

import java.util.Scanner;

public class StringDemoReplace {
    public static void main(String[] args) {
        String commonString = " DONT DO IT DUMMY";
        String result = commonString.replace("DUMMY", "*******");
        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write something: ");
        String result2= letterReplace(sc.nextLine());
        System.out.println(result2);
    }

    public static String letterReplace(String input){
        //HI YOU DUMMY, PLEASE DONT DO STUPID AND BAD THINGS.!!!! :<
    
        String[] arr = {"DUMMY","STUPID","BAD"};
        for (int i = 0; i < arr.length; i++) {
            input =  input.replace(arr[i], "***");
            
        }
        return input;
    }
}
