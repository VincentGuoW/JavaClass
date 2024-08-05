package May2024.Class04;

import java.util.Scanner;

public class test7 {
    // password security =>
        //1. each digit add 5 then %10 keep the remainder
        //2. rotate the whole number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your password: ");
        int password = sc.nextInt();
        int result = passwordSecurity(password);
        System.out.println(result);
    }

    public static int passwordSecurity(int password){
        int passwordLength = 0;
        //find password length. 
        int inputPassword1 = password;
        while(inputPassword1!=0){//used all password, so I need new password to store data.
            inputPassword1=inputPassword1/10;
            passwordLength++;
        }
        
        //int password to array password.each digit (+5 then  %10)
        int[] passwordArray = new int[passwordLength];
        int inputPassword2 = password;
        for (int i = 0; i < passwordArray.length; i++) {
            int input = inputPassword2%10;
            passwordArray[passwordArray.length-1-i]=(input+5)%10;
            System.out.println(passwordArray[passwordLength-1-i]);
            inputPassword2=inputPassword2/10;
        }
     
        
        //rotate the whole array, first one to the last one.
        for (int i = 0, j = passwordArray.length-1; i < j; i++,j--) {
            int temp = passwordArray[i];
            passwordArray[i]= passwordArray[j];
            passwordArray[j]=temp;
        }

        //array to int
        int outputs=0;
        for (int i = 0; i < passwordArray.length; i++) {
            outputs=outputs*10+passwordArray[i];
        }
        return outputs;
    }
}
