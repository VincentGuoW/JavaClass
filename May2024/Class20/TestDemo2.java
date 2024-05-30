package May2024.Class20;

import java.util.Random;

public class TestDemo2 {
    //Need random code: upper/lower/number length==>5 (number=>1 letter=>4)
    //
    public static void main(String[] args) {
        int length = 5;
        //number 48-57
        //upper 65-90
        //lower 97-122
        System.out.println();

        Random randomNumber = new Random();
        char number = (char)+(randomNumber.nextInt(10)+'0');
        System.out.println(number);

        char [] letterArray =new char[4];
        for (int i = 0; i<letterArray.length;) {
            Random randomLetter = new Random();
            char letterAscii = (char)(randomLetter.nextInt(122-65+1)+65);
            if(letterAscii<=90 || letterAscii>=97){
                letterArray[i]=letterAscii;
                i++;
                System.out.println(letterAscii);
            }
        }

        char[] resultArray = new char[5];
        resultArray[0]=number;
        for (int i = 1; i < resultArray.length; i++) {
            resultArray[i]=letterArray[i-1];
        }
        for (int i = 0; i < resultArray.length; i++) {
            char temp = resultArray[i];
            Random random = new Random();
            int randomNum = random.nextInt(resultArray.length);
            resultArray[i]=resultArray[randomNum];
            resultArray[randomNum]=temp;

            // Random random = new Random();
            // int randomNum = random.nextInt(resultArray.length);
            // char temp = resultArray[randomNum];
            // resultArray[randomNum]= resultArray[i];
            // resultArray[i]=temp;
        }


        String result = new String(resultArray);
        System.out.println("Result is : " + result);


    }
}
