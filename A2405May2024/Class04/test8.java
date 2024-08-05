package May2024.Class04;

import java.util.Random;

public class test8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] lottery = { 2, 588, 888, 1000, 10000 };

        /* 
        for (int j = 0; j < lottery.length;) {
            int winner = r.nextInt(lottery.length);
            //System.out.println(lottery.length);
            //System.out.println(winner);
            if (lottery[winner] != 0) {
                System.out.println("Winner price: $" + lottery[winner]);
                lottery[winner] = 0;
                j++;

            } else {
                winner = r.nextInt(lottery.length);// nextInt(number) => 0 to (number-1) not include that number aleady
                //System.out.println("Wrong " + winner);
            }
        }
        */

        //better way
        for (int i = 0; i < lottery.length; i++) {
            int randomIndex = r.nextInt(lottery.length);
            int temp = lottery[i];
            lottery[i] = lottery[randomIndex];
            lottery[randomIndex]=temp;
        }
        for (int i = 0; i < lottery.length; i++) {
            System.out.print(lottery[i] + "  ");
        }
    }
}
