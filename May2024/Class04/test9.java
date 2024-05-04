package May2024.Class04;

import java.util.Random;

public class test9 {
    /*
     * lottery + :
     * 6 red balls => 1-33(each)
     * 1 blue ball => 1-16(each)
     * 
     * First Prize =>Red:6 Blue:1
     * 
     * Second Price =>Red:6 Blue:0
     * 
     * Third Price =>Red:5 Blue:1
     * 
     * Fourth Price =>Red:5 Blue:0
     * Fourth Price =>Red:4 Blue:1
     * 
     * Fifth Price =>Red:4 Blue:0
     * Fifth Price =>Red:3 Blue:1
     * 
     * Sixth Prize =>Red:2 Blue:1
     * Sixth Prize =>Red:1 Blue:1
     * Sixth Prize =>Red:0 Blue:1
     * 
     */
    public static void main(String[] args) {
        int[] test=lotteryNumber(7);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public static int[] lotteryNumber(int lottNumberLength) {
        // First 6 need 1-33(can not be the same)
        // Last 1 need 1-16

        Random r = new Random();
        int[] array = new int[lottNumberLength];
        for (int i = 0; i < (array.length-1); ) {
            int pickNumber = (r.nextInt(33) + 1);
            boolean diffNumber = true;
          
            for (int j = 0; j < (array.length-1); j++) {
                if(array[j]==pickNumber){
                    diffNumber=false;
                    break;
                }
                else{
                    diffNumber=true;
                }
            }
            if(diffNumber){
                array[i]=pickNumber;
                i++;
            }else{
                pickNumber = (r.nextInt(33) + 1);
            }
        }

        array[lottNumberLength-1]=(r.nextInt(16)+1);

        return array;
    }

}
