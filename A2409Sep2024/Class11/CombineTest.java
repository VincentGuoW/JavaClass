package A2409Sep2024.Class11;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTest {
    public static void main(String[] args) {
        System.out.println();
        /*
                input 1-100 int number
                add it into array
                when array combine above 200 stop
         */
        ArrayList<String> totalArr = new ArrayList<String>();

        keepAddingNumber(totalArr);

        System.out.println("The total input above 200");
        int totalAmount = 0;
        for (int i = 0; i < totalArr.size(); i++) {
            System.out.println("The " +i+ " number is: "+totalArr.get(i));
            totalAmount= totalAmount+ Integer.parseInt(totalArr.get(i));
        }
        System.out.println("Total: " + totalAmount);
        
        
    }

    private static void keepAddingNumber(ArrayList<String> totalArr) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input number 1-100");
            String input = sc.nextLine();
            if (checkIntRange(input)) {
                totalArr.add(input);
                int totalAmount = 0;
                for (int i = 0; i < totalArr.size(); i++) {
                    totalAmount = totalAmount + Integer.parseInt(totalArr.get(i));
                }
                if (totalAmount > 200) {
                    break;
                }
            }
        }
    }

    public static boolean checkIntRange(String input){
        if(input==null){
            return false;
        }
        try{
            Integer.parseInt(input);
            if(Integer.parseInt(input)>=1 &&Integer.parseInt(input)<=100 ){
                return true;
            }
            return false;
        }catch(NumberFormatException e){
            return false;
        }

    }

    /*
    1. sc in while, what wrong with it
    2. try catch what that for
        try catch can replace with if(num<1 || num >100){continue}// skip this time

    */
}
