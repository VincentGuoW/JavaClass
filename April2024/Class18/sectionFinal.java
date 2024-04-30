package April2024.Class18;

import java.util.Scanner;

public class sectionFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input int number inside: ");
        int inputNubmer = sc.nextInt();
        
        int outputNumber =0;
        int newInputNumber =inputNubmer;

        while(newInputNumber!=0){
            outputNumber=newInputNumber%10+outputNumber*10;
            newInputNumber=newInputNumber/10;
            System.out.println(outputNumber);
            System.out.println(newInputNumber);
        }
        if(outputNumber==inputNubmer){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
        
}
