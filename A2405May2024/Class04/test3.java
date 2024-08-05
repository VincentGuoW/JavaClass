package May2024.Class04;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        // for (int i = 0; i < 4; i++) {
        //     System.out.print(randomLetter()  + " ");
        // }
        // System.out.print(randomNumber());
        randomLetter(); 
        System.out.println((char)6);
    }
    public static char randomLetter(){
        Random r = new Random();
        int test = r.nextInt(26)+'a';
        char test1 = (char)test;
        System.out.println(test);
        System.out.println(test1);
        char output = (char)(r.nextInt(26)+'a');//'a' use '' not "", so it will change into number!!
        return output;
    }

    public static int randomNumber(){
        Random r = new Random();
        int output = r.nextInt(10); //nextInt(put the max range) E.g. 0-99 =>nextInxt(100)
        return output;
    }
}
