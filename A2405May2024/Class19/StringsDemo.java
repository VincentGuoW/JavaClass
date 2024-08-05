package May2024.Class19;

import java.util.Scanner;

public class StringsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your string:");
        String str = sc.nextLine();

        int strLength = str.length();

        System.out.println("The length is: " + strLength);

        for (int i = 0; i < strLength; i++) {
        
            System.out.println("The "+ (i+1) +" letter is: "+str.charAt(i) +".");
        }
        
    }
}
