package June2024.Class04;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        System.out.println();
        String letterList = "ABCDEFGabcdefg";
        String numberList = "0123456789";

        Random rand = new Random();

        char digit = numberList.charAt(rand.nextInt(numberList.length()));

        StringBuilder letters = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            letters.append(letterList.charAt(rand.nextInt(letterList.length())));
        }
        String output = letters.toString() + digit;

        char[] outputChar = output.toCharArray();
        for (int i = 0; i < outputChar.length; i++) {
            char temp = outputChar[i];
            int randomeNumber= rand.nextInt(outputChar.length);
            outputChar[i]=outputChar[randomeNumber];
            outputChar[randomeNumber]=temp;
        }
        output = new String(outputChar);
            System.out.println(output);
        
    }
}
