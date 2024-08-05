package May2024.Class20;

import java.util.Scanner;

public class StringBuilderDemo3 {
    //Check if the string symmetry(12321  123321)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please put the string in");
        String inputString = sc.next();
        System.out.println("The String you put in is "+stringSymmetry(inputString)+" symmetry");
    }

    public static boolean stringSymmetry(String input){
        boolean isSymmetry;
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb=sb.reverse();
        //String symmetryString = new StringBuilder().append(input).reverse().toString();
        isSymmetry = sb.toString().equals(input);
        return isSymmetry;
    }
}
