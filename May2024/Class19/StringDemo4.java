package May2024.Class19;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Input: ");
        String inputString = sc.nextLine();
        String outputString="";
        for (int i = (inputString.length()-1); i >=0; i--) {
            outputString=outputString+inputString.charAt(i);
        }
        System.out.println(outputString);
      
    }   
}
