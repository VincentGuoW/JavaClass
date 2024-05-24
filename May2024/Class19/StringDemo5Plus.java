package May2024.Class19;

import java.util.Scanner;

public class StringDemo5Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        String outputString="";
        while (true){
            System.out.println("Please input money:");
            money=sc.nextInt();
            if(money>=0 && money<=9999999){
                break;
            }
            else{
                System.out.println("Not valid money!");
            }
        }
        while (true) {
            int lastDigit = money%10;
            String capNumber = getCapitalNumber(lastDigit);
            outputString = capNumber+", " +outputString;
            money=money/10;
            if (money==0) {
                break;
            }
        }

        System.out.println(outputString);


    }

    public static String getCapitalNumber(int money){
        String[] arr = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",};
        return arr[money];
    }
}
