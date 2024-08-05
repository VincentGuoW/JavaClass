package May2024.Class19;

import java.util.Scanner;

public class CountInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your string:");
        String str = sc.nextLine();

        int strLength = str.length();

        System.out.println("The length is: " + strLength);

        int upperCount=0;
        int lowerCount=0;
        int numberCount=0;

        for (int i = 0; i < strLength; i++) {
            char inputCharInChar = str.charAt(i);//we can use char to get char or straight use int to get the ascii #
            int inputCharInASCII = str.charAt(i);
            // if(inputCharInASCII>=65 && inputCharInASCII<=90){
            //     upperCount++;
            // }
            // if (inputCharInASCII>=97 && inputCharInASCII<=122) {
            //     lowerCount++;
            // }
            // if (inputCharInASCII>=48 && inputCharInASCII<=57) {
            //     numberCount++;
            // } 
            //Simple way to use ASCII table!!
            if(inputCharInChar>='A' && inputCharInChar<='Z'){
                upperCount++;
            }
            else if (inputCharInChar>='a' && inputCharInChar<='z') {
                lowerCount++;
            }
            else if (inputCharInChar>='0' && inputCharInChar<='9') {
                numberCount++;
            } 
            else{
                
            }
            
        }
        System.out.println("Upper count: "+upperCount);
        System.out.println("Lower count: "+lowerCount);
        System.out.println("Number count: "+numberCount);

    }
}
