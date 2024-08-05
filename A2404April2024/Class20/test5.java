package April2024.Class20;

import java.util.Random;
import java.util.Scanner;

public class test5 {
    //1-100
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int guessNumber = r.nextInt(100)+1;

        System.out.println("Please guess the number!");
        int inputNumber = sc.nextInt();

        while(inputNumber!=guessNumber){
            if(inputNumber<guessNumber){
                System.out.println("Go higher!");
            }
            else{
                System.out.println("Go Lower!");
            }
            System.out.println("Please guess the number!");
            inputNumber = sc.nextInt();
        }
        System.out.println("Good Job");
        
        
    }
}
