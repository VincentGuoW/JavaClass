package A2409Sep2024.Class11;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTestPlus {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("In put a number");
            String numStr = sc.nextLine();
            if(checkInputNumber(numStr)){
                //use valueOf not parseInt ==> cus we need Integer not int
                list.add(Integer.valueOf(numStr));
                //list.add(Integer.parseInt(numStr)); New java will auto adjust int to Integer
            }
            int total = 0;
            for (int i = 0; i < list.size(); i++) {
                total = total + list.get(i);
            }
            if(total>200){
                System.out.println("Total: " + total);
                break;
            }
            

        }
    }

    public static boolean checkInputNumber(String numStr){
        String regex = "\\d+";
        if(numStr.matches(regex)){
            int inputNumber = Integer.parseInt(numStr);
            if(inputNumber>=1 && inputNumber<=100){
                return true;
            }
            else{
                System.out.println("Input out of 1-100 range");
            }
        }else{
            System.out.println("Input is not a number");
        }
        return false;
    }
}
