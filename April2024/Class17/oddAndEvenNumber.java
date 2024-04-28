package April2024.Class17;

import java.util.Scanner;

public class oddAndEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number:");
        int inputNumber = sc.nextInt();
        boolean testBoolean;
        /* 
        if(inputNumber%2 == 0){
            System.out.println("Odd");
        */
        if(inputNumber%2 != 0){
            System.out.printf("Odd");
            testBoolean=false;
        }
        if(inputNumber%2 != 0){
            System.out.printf("Odd");
            testBoolean=false;
        }
        else{
            System.out.println("Even");
            testBoolean=false;
        }
        if(testBoolean==true){
            System.out.println("Boolean => True");
        }

        
    }
}
