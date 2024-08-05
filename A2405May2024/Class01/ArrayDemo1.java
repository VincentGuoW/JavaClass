package May2024.Class01;

import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //10 randome 1-100 into array. 
        //1. totoal
        //2. average
        //3. how many below average

        
        int [] demoArray = new int[10];
        Random r = new Random();
        //Get array fill with 10 random number
        for (int i = 0; i < demoArray.length; i++) {
            int inputNumber = r.nextInt(100)+1;
            demoArray[i]=inputNumber;
            System.out.print(demoArray[i]+" ");//just print wont change lines~!
        }

        //Get total:
        int totalNumber=0;
        for (int i = 0; i < demoArray.length; i++) {
            totalNumber+=demoArray[i];
        }
        System.out.println(totalNumber);

        //Get average:
        int averageNumber=totalNumber/demoArray.length;
        System.out.println(averageNumber);

        //Count how many less than average:
        int amountBelowAverage=0;
        for (int i = 0; i < demoArray.length; i++) {
            if(demoArray[i]<averageNumber){
                amountBelowAverage++;
            }
        }
        System.out.println(amountBelowAverage);
    }
}
